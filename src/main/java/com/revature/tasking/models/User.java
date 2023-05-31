package com.revature.tasking.models;

import jakarta.persistence.Entity;

import java.util.Set;

@Entity
public class User {
    private long user_id;
    private String username;
    private String password;
    private Set<Task> queue;

}
