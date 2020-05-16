package com.example.demo.Service;

import com.example.demo.Model.User;
import com.example.demo.dao.FakeRepo;
import com.example.demo.dao.FakeRepoInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;

import java.lang.annotation.Annotation;

public class UserServiceImplementation implements FakeRepoInterface<User> {
    @Autowired
    public FakeRepo fRepo;

    @Override
    public void insertUser(int id, String name, String surname) {
        fRepo.insertUser(id,name,surname);
    }

    @Cacheable("cacheUser")
    @Override
    public User findUserById(int id) {
        try
        {
            System.out.println("Going to sleep for 5 Secs.. to simulate backend call.");
            Thread.sleep(1000*5);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        return fRepo.findUserById(id);
    }

    @Override
    public void deleteUser(int id) {
        fRepo.deleteUser(id);
    }
}
