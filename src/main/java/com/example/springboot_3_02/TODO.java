package com.example.springboot_3_02;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class TODO {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;


    @NotNull
    @Size (min=4)
    private String taskname;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTaskname() {
        return taskname;
    }

    public void setTaskname(String taskname) {
        this.taskname = taskname;
    }

    public String getDuedate() {
        return duedate;
    }

    public void setDuedate(String duedate) {
        this.duedate = duedate;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    @NotNull
    @Size (min=10)
    private String duedate;

    @NotNull
    @Size (min=4)
    private String priority;






}
