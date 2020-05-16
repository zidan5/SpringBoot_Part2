package com.example.demo.dao;

public interface FakeRepoInterface<T> {
    void insertUser(int id, String name,String surname);
    T findUserById(int id);
    void deleteUser(int id);
}
