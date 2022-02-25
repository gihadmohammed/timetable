/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nourhan
 */
public class timetable {
    int emp_id , day;
    String entry,exit , total_hours,day_hours;

    public timetable(int emp_id, int day, String entry, String exit, String total_hours, String day_hours) {
        this.emp_id = emp_id;
        this.day = day;
        this.entry = entry;
        this.exit = exit;
        this.total_hours = total_hours;
        this.day_hours = day_hours;
    }

    public timetable(int emp_id, String entry) {
        this.emp_id = emp_id;
        this.entry = entry;
    }

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String getEntry() {
        return entry;
    }

    public void setEntry(String entry) {
        this.entry = entry;
    }

    public String getExit() {
        return exit;
    }

    public void setExit(String exit) {
        this.exit = exit;
    }

    public String getTotal_hours() {
        return total_hours;
    }

    public void setTotal_hours(String total_hours) {
        this.total_hours = total_hours;
    }

    public String getDay_hours() {
        return day_hours;
    }

    public void setDay_hours(String day_hours) {
        this.day_hours = day_hours;
    }
    

//    // get total hours per daaay
//    public timetable(String entry, String exit) {
//        try {
//            String time1 = entry;
//            String time2 = exit;
//            
//            SimpleDateFormat format = new SimpleDateFormat("HH:mm");
//            Date date1 = (Date) format.parse(entry);
//            Date date2 = (Date) format.parse(exit); 
//            long total_hours = date2.getTime() - date1.getTime();
//        } catch (ParseException ex) {
//            System.out.println(ex.getMessage());
//        }
//    }
//    //////////////////////////////
//     String time1 = entry.getText();
//                    String time2 = exit.getText();
//
//                    SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
//                    Date date1 = (Date) format.parse(time1);
//                    Date date2 = (Date) format.parse(time2);
//                    double total_hours = date2.getTime() - date1.getTime();
//
//                    dh.equals(total_hours);
//

  
    
}
