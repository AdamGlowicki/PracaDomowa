package com.adamglowicki.userengine.domain;

public class User {

    private Integer id;
    private String name;
    private String login;
    private String password;
    private Integer age;

    public User() {
    }

    public User(Integer id, String name, String login, String password, Integer age) {
        this.id = id;
        this.name = name;
        this.login = login;
        this.password = password;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
