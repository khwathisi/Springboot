package com.example.spring.service;

import com.example.spring.dao.FakeRepoInterface;
import com.example.spring.model.User;

public class UserServiceImpl {
    private final FakeRepoInterface fakeRepoInterface;

    public UserServiceImpl(FakeRepoInterface fakeRepoInterface) {
        this.fakeRepoInterface = fakeRepoInterface;
    }

    public String addUser (User user){
        return fakeRepoInterface.insertUser(user)+" entered";
    }

    public String removeUser (Long id){
        return fakeRepoInterface.deleteUser(id)+" removed";
    }

    public String getUser (Long id){
        return "hello "+fakeRepoInterface.findUserById(id);
    }
}
