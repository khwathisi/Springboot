package com.springweb.Entity;

import com.springweb.Interface.FakeRepoInterface;

import java.util.Map;
import java.util.UUID;

public class User {
    private static Map<Integer, User> user;
    private long Id;
    private String name;
    private String surname;

    public User(
            int id,
            String name,
            String surname) {
        this.Id = id;
        this.name = name;
        this.surname = surname;
    }

    //Getters
    public long getId() { return Id; }
    public String getName() { return name; }
    public String getSurname() { return surname; }

    //Setters
    public void setId(long id) { Id = id; }
    public void setName(String name) { this.name = name; }
    public void setSurname(String surname) { this.surname = surname; }

    public void insertUser(User user) {
        this.user.put((int) user.getId(),user);
    }
}


