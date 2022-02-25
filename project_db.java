/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import domain.project;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Nourhan
 */
public class project_db {

    public static Connection connect() throws SQLException {
        return DriverManager.getConnection("jdbc:sqlite:ps_pl2.db");
    }

    public static ArrayList<domain.project> view_project() {
        ArrayList<domain.project> list = new ArrayList<>();
        try {   Connection con = connect();
                PreparedStatement p = con.prepareStatement("select * from project ");
            ResultSet r = p.executeQuery();
            while (r.next()) {
                list.add(new project(r.getInt("Project_id"), r.getInt("task_num"), r.getInt("no_projct_tasks"), r.getInt("Checked_tasks"), r.getDouble("Percentage_of_acheived prj")));
            }

        } catch (SQLException ee) {
            System.out.println(ee.getMessage());
        }
        return list;
    }
    
      public static ArrayList<domain.project> view_percentage() {
        ArrayList<domain.project> list = new ArrayList<>();
        try {   Connection con = connect();
                PreparedStatement p = con.prepareStatement("select * from project ");
            ResultSet r = p.executeQuery();
            while (r.next()) {
                list.add(new project(r.getInt("Project_id"), r.getInt("no_projct_tasks"), r.getInt("Checked_tasks"), r.getDouble("Percentage_of_acheived prj")));
            }

        } catch (SQLException ee) {
            System.out.println(ee.getMessage());
        }
        return list;
    }
}
