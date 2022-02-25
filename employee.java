/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.sql.Time;
import java.sql.Timestamp;

/**
 *
 * @author Nourhan
 */
public class employee {

    String user_name, password, position, report;
    double salary;
    int off_days, p_vac, p_late, task_id;
    int emp_id;
    double monthly_hours;

    public employee( int emp_id,String user_name, String report) {
        this.user_name = user_name;
        this.report = report;
        this.emp_id = emp_id;
    }

    public employee(String user_name, String password, String position, double salary, int off_days) {
        this.user_name = user_name;
        this.password = password;
        this.position = position;
        this.salary = salary;
        this.off_days = off_days;
    }
    public employee(String user_name, String password, String position) {
        this.user_name = user_name;
        this.password = password;
        this.position = position;
    }

//    public employee(String user_name, String password) {
//        this.user_name = user_name;
//        this.password = password;
//    }

    public employee(int emp_id, String user_name, String password, String position, double salary, double monthly_hours, int off_days, int p_vac, int p_late, String report, int task_id) {
        this.emp_id = emp_id;
        this.user_name = user_name;
        this.password = password;
        this.position = position;
        this.salary = salary;
        this.monthly_hours = monthly_hours;
        this.off_days = off_days;
        this.p_vac = p_vac;
        this.p_late = p_late;
        this.report = report;
        this.task_id = task_id;

    }

    public employee(int aInt, String string, String string0, double aDouble, String string1, Time time, int aInt0, int aInt1, int aInt2, int aInt3, int aInt4) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getReport() {
        return report;
    }

    public void setReport(String report) {
        this.report = report;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getOff_days() {
        return off_days;
    }

    public void setOff_days(int off_days) {
        this.off_days = off_days;
    }

    public int getP_vac() {
        return p_vac;
    }

    public void setP_vac(int p_vac) {
        this.p_vac = p_vac;
    }

    public int getP_late() {
        return p_late;
    }

    public void setP_late(int p_late) {
        this.p_late = p_late;
    }

    public int getTask_id() {
        return task_id;
    }

    public void setTask_id(int task_id) {
        this.task_id = task_id;
    }

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public double getMonthly_hours() {
        return monthly_hours;
    }

    public void setMonthly_hours(double monthly_hours) {
        this.monthly_hours = monthly_hours;
    }

    public Object getposition() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
