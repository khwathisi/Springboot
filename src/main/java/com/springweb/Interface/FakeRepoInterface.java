package com.springweb.Interface;

import com.springweb.Entity.User;
import java.util.Collection;

public interface FakeRepoInterface {
    //void insertUser(long id, String name, String surname){}

    Collection<User> getAllUsers();

    User insertUser(long id, String name, String surname);

    User findUserById(long id);

    User deleteUser(long id);

}
