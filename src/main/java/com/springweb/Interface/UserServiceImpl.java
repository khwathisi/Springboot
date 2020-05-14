package com.springweb.Interface;
import com.springweb.Entity.User;
import java.util.Collection;

public class UserServiceImpl implements FakeRepoInterface {

    @Override
    public User insertUser(String name, String surname) {
        try
        {
            insertUser(name,surname);
        }catch(Exception e)
        {
            System.out.println("ERROR: " + e.getMessage());
        }
        insertUser(name,surname);
        return null;
    }

    @Override
    public User findUserById(int id) {
        findUserById(id);
        return null;
    }

    @Override
    public User deleteUser(int id) {
        deleteUser(id);
        return null;
    }
}
