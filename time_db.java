/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import static database.employee_db.connect;
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
public class time_db {
      public static Connection connect() throws SQLException{
        return DriverManager.getConnection("jdbc:sqlite:ps_pl2.db");
    }
      
     public static ArrayList<domain.timetable> view_time_table() throws SQLException {
        ArrayList<domain.timetable> list = new ArrayList<>();
        try {   Connection con = connect();
                PreparedStatement p = con.prepareStatement("select * from time_sheet");
            ResultSet r = p.executeQuery();
            while (r.next()) {
           list.add(new domain.timetable(r.getInt("day"), r.getInt("t_emp_id"), r.getString("entry_time"), r.getString("left_time"),  r.getString("total_time"),r.getString("hours_day")));

            } 
         } catch (SQLException ee) {
            System.out.println(ee.getMessage());
        }
        return list;
    }
     
       public static void add_entry(int day,int emp_id,String entry_time) {
        try{
        Connection con=connect();
        PreparedStatement p= con.prepareStatement("insert into time_sheet (day,t_emp_id,entry_time) values(?,?,?)");
        p.setInt(1, day);
        p.setInt(2, emp_id);
        p.setString(3, entry_time);
        p.executeUpdate();
        }catch(SQLException ee){
            System.out.println(ee.getMessage());
        }}
       
//       public static void cal_daily(int day,int emp_id,,String exit_time,String exit_time,,String daily) {
//        try{
//        Connection con=connect();
//        PreparedStatement p= con.prepareStatement("update time_sheet set (left_time) values(?) where t_emp_id=? and day=? and entry_time=? and left_time =?");
//        p.setString(1, exit_time);
//        p.setInt(2, emp_id);
//         p.setInt(3, day);
//        p.executeUpdate();
//        }catch(SQLException ee){
//            System.out.println(ee.getMessage());
//        }}
    
}
