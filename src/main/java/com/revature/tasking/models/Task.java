package com.revature.tasking.models;

import jakarta.persistence.Entity;

@Entity
public class Task {
    private long task_id;
    private String title;
    private String description;
    private String deadline;
    private User user;
}
