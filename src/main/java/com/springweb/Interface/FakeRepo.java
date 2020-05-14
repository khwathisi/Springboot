package com.springweb.Interface;
import com.springweb.Entity.User;
import org.springframework.stereotype.Repository;
import java.util.Map;
import java.util.HashMap;
import java.util.*;

@Repository
public class FakeRepo implements FakeRepoInterface{

    private static Map<Integer, User> users;

    static{
        users = new HashMap<Integer, User>() {
            {
                put(1, new User(UUID.randomUUID(),
                        "Mphuluseni",
                        "Khwathisi"));

                put(2, new User(UUID.randomUUID(),
                        "Godfrey",
                        "Khwathisi"));

                put(3, new User(UUID.randomUUID(),
                        "Vhahangwele",
                        "Khwathisi"));
            }
        };
    }
/*    ArrayList<User> users = new ArrayList<User>();
    User user[] = new User[3];*/

   /* //@Override
    public User insertUsera(User user) {
        return null;
    }*/

    @Override
    public User insertUser(String name, String surname) {
        /*this.users.put((int) user.getId(),user);*/
        users.put(1, new User(UUID.randomUUID(), name, surname));
        System.out.println(name + " entered");
        return null;
    }

    @Override
    public User findUserById(int id) {
        String name = users.get(id).getName();
        return this.users.get(id);
        //System.out.println("hello" + name);
    }

    @Override
    public User deleteUser(int id) {
        String name = users.get(id).getName();
        this.users.remove(id);
        System.out.println(name + " removed");
        return null;
    }

    public User getUserById(int id){ return this.users.get(id); }

    //  removes object's values or entities.
    public void removeUserById(int id) {
        this.users.remove(id);
    }

    //@Override
    public Collection<User> getAllUsers() {

        return null;
    }





}
