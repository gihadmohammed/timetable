
package database;

import static database.project_db.connect;
import domain.project;
import domain.task;
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
public class task_db{
     public static Connection connect() throws SQLException {
        return DriverManager.getConnection("jdbc:sqlite:ps_pl2.db");
    }
   
     public static ArrayList<domain.task> view_task() {
        ArrayList<domain.task> list = new ArrayList<>();
        try {   Connection con = connect();
                PreparedStatement p = con.prepareStatement("select * from task ");
            ResultSet r = p.executeQuery();
            while (r.next()) {
                list.add(new task(r.getInt("task_id"), r.getInt("s_emp_id"), r.getString("task_name"), r.getInt("check_col"), r.getInt("no_of_tasks"), r.getInt("prj_id")));
            }

        } catch (SQLException ee) {
            System.out.println(ee.getMessage());
        }
        return list;
    }
      
}
