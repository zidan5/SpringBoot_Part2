package com.example.demo.dao;

import com.example.demo.Model.User;

import java.util.Hashtable;

public class FakeRepo implements FakeRepoInterface<User>{
    private Hashtable<Integer, User> users;

    public FakeRepo(){
        users = new Hashtable<>();
        users.put(1,new User("Mpho","Mokoena",1));
        users.put(2,new User("Thabang","Masilo",2));
    }

    @Override
    public void insertUser(int id, String name, String surname) {
        users.put(id,new User(name,surname,id));
    }

    @Override
    public User findUserById(int id) {
        return users.get(id);
    }

    @Override
    public void deleteUser(int id) {
        users.remove(id);
    }
}
