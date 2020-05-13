package com.springweb.Entity;

public class User {
    private long Id;
    private String name;
    private String surname;

    //Getters
    public long getId() { return Id; }
    public String getName() { return name; }
    public String getSurname() { return surname; }

    //Setters
    public void setId(long id) { Id = id; }
    public void setName(String name) { this.name = name; }
    public void setSurname(String surname) { this.surname = surname; }
}


