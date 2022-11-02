package com.Wayne_proxy02;

public interface UserService {
    String login(String loginName, String passWord);

    void deleteUsers();

    String selectUsers();

    void deldteById(int id);
}
