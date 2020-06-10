package com.auth.model;

public class User {
    private String username;
    private String password;
    private String phone;
    private String gender;

    public User() {
    }

    public User(String username, String phone, String gender) {
        this.username = username;
        this.phone = phone;
        this.gender = gender;
    }
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean checkUser() {
        return username != null && password != null &&
                !username.isEmpty() && !password.isEmpty() &&
                username.equals("Senbonzakura") &&
                password.equals("1234");
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
