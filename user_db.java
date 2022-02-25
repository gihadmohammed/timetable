
package database;

import domain.employee;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Nourhan
 */
public class user_db {
    public static Connection connect() throws SQLException{
        return DriverManager.getConnection("jdbc:sqlite:ps_pl2.db");
        
    } 
     public static void insert_user(String user,String pass,String position) throws SQLException{
        try{
        Connection con=connect();
        PreparedStatement p= con.prepareStatement("insert into employee (emp_name,password,position) values(?,?,?)");
        p.setString(1, user);
        p.setString(2, pass);
        p.setString(3, position);
        p.execute();
        }catch(SQLException ee){
            System.out.println(ee.getMessage());
        }

    
   
        
    }
    public static ArrayList<employee> get_employee(){
        ArrayList<employee> list=new ArrayList<>();
        try{
             Connection con=connect();
             PreparedStatement p= con.prepareStatement("select * from employee");
             ResultSet r=p.executeQuery();
             while(r.next()){
                 list.add(new employee(r.getString("emp_name"),r.getString("password"),r.getString("position")));
                 
             }
             
       
        }catch(SQLException ee){
            System.out.println(ee.getMessage());
        }
        return list;
    }
   
      
      
    
    
    public static int check_user(String user,String password,String position){
        ArrayList<employee> arr=get_employee();
        int x=0;
        for(int i=0;i<arr.size();i++){
            if(arr.get(i).getUser_name().equalsIgnoreCase(user)){
                if(arr.get(i).getPassword().equalsIgnoreCase(password)){
                    if(arr.get(i).getPosition().equalsIgnoreCase(position)){
                    x=1;  //good username and pss
                    
                    break;
                }else{
                    x=3;//wrong position
                    break;
                    }
                }else{
                    x=2; //wrong password
                    break;
                }
            }else{
                x=0;   //wrong username
            }
            
        }
        return x;
    }

 


}
