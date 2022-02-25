/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author Nourhan
 */
public class task{
    String task_name;
    int prj_id ,task_id,no_of_tasks,checked_tasks,emp_id;
    
    

    public task(int task_id,int emp_id,String task_name,  int checked_tasks, int no_of_tasks, int prj_id) {
        this.task_name = task_name;
        this.prj_id = prj_id;
        this.task_id = task_id;
        this.emp_id=emp_id;
        this.no_of_tasks = no_of_tasks;
        this.checked_tasks = checked_tasks;
    }

    public int getPrj_id() {
        return prj_id;
    }

    public void setPrj_id(int prj_id) {
        this.prj_id = prj_id;
    }

    public int getTask_id() {
        return task_id;
    }

    public void setTask_id(int task_id) {
        this.task_id = task_id;
    }

    public int getNo_of_tasks() {
        return no_of_tasks;
    }

    public void setNo_of_tasks(int no_of_tasks) {
        this.no_of_tasks = no_of_tasks;
    }

    public int getChecked_tasks() {
        return checked_tasks;
    }

    public void setChecked_tasks(int checked_tasks) {
        this.checked_tasks = checked_tasks;
    }

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

  

    public String getTask_name() {
        return task_name;
    }

    public void setTask_name(String task_name) {
        this.task_name = task_name;
    }
    
}
