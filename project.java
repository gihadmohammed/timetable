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
public class project {
    int prj_id ,task_id,no_of_tasks,checked_tasks;
    double percentage;

    public project(int task_id, int no_of_tasks, int checked_tasks, double percentage) {
        this.task_id = task_id;
        this.no_of_tasks = no_of_tasks;
        this.checked_tasks = checked_tasks;
        this.percentage = checked_tasks / no_of_tasks *100;
    }

    public project(int prj_id, int task_id, int no_of_tasks, int checked_tasks) {
        this.prj_id = prj_id;
        this.task_id = task_id;
        this.no_of_tasks = no_of_tasks;
        this.checked_tasks = checked_tasks;
    }
    

    public project(int prj_id, int task_id, int no_of_tasks, int checked_tasks, double percentage) {
        this.prj_id = prj_id;
        this.task_id = task_id;
        this.no_of_tasks = no_of_tasks;
        this.checked_tasks = checked_tasks;
        this.percentage = percentage;
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

    public double getPercentage() {
        return checked_tasks / no_of_tasks *100;
    }

    public void setPercentage(double percentage) {
        this.percentage = checked_tasks / no_of_tasks *100;
    }


    
    
    
}
