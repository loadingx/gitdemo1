package com.baizhi.cc.entity;

/**
 * Created by Administrator on 2019/1/14 0014.
 */
public class User {

    private String uid;
    private String name;
    private String password;

    private String phone;


    public User() {
        super();
    }

    @Override
    public String toString() {
        return "User{" +
                "uid='" + uid + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User(String uid, String name, String password) {

        this.uid = uid;
        this.name = name;
        this.password = password;
    }
}
