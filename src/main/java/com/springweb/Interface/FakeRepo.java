package com.springweb.Interface;
import com.springweb.Entity.User;
import org.springframework.stereotype.Repository;

import java.util.Map;
import java.util.HashMap;

import java.util.*;

@Repository
public class FakeRepo implements FakeRepoInterface{

    ArrayList<User> users = new ArrayList<User>();
    User user[] = new User[3];
    users
    //@Override
    public Collection<User> getAllUsers() {
        return null;
    }

    //@Override
    public User insertUser(long id, String name, String surname) {

        return null;
    }

    //@Override
    public User findUserById(long id) {
        return null;
    }

    //@Override
    public User deleteUser(long id) {
        return null;
    }
}
