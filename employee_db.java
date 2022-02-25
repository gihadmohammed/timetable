/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import domain.employee;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nourhan
 */
public class employee_db {
    
    public static Connection connect() throws SQLException{
        return DriverManager.getConnection("jdbc:sqlite:ps_pl2.db");
    }
     public static void add_user(String user,String pass,String position,double salary,int off) {
        try{
        Connection con=connect();
        PreparedStatement p= con.prepareStatement("insert into employee (emp_name,password,position,salary,left_vacation) values(?,?,?,?,?)");
        p.setString(1, user);
        p.setString(2, pass);
        p.setString(3, position);
        p.setDouble(4, salary);
        p.setInt(5, off);
        p.executeUpdate();
        }catch(SQLException ee){
            System.out.println(ee.getMessage());
        }}
      public static ArrayList<domain.employee> get_emp_report() throws SQLException {
        ArrayList<domain.employee> list = new ArrayList<>();
        try {   Connection con = connect();
                PreparedStatement p = con.prepareStatement("select emp_id,emp_name,repoet from employee");
            ResultSet r = p.executeQuery();
            while (r.next()) {
           list.add(new domain.employee(r.getInt("emp_id"), r.getString("emp_name"),r.getString("repoet")));

            } 
         } catch (SQLException ee) {
            System.out.println(ee.getMessage());
        }
        return list;
    }
        
         public static ArrayList<domain.employee> view_employee() throws SQLException {
        ArrayList<domain.employee> list = new ArrayList<>();
        try {   Connection con = connect();
                PreparedStatement p = con.prepareStatement("select * from employee");
            ResultSet r = p.executeQuery();
            while (r.next()) {
           list.add(new domain.employee(r.getInt("emp_id"), r.getString("emp_name"), r.getString("password"), r.getString("position"),  r.getDouble("salary"),r.getDouble("hours_per_month"),r.getInt("left_vacation"),r.getInt("p_vacation"),r.getInt("p_being_late"),r.getString("repoet"),r.getInt("task_id")));

            } 
         } catch (SQLException ee) {
            System.out.println(ee.getMessage());
        }
        return list;
    }
         
         
    }
     
      





