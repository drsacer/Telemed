package com.telemed;

public class User {
    private String name;
    private String surname;
    private String username;
    private String password;
    private int years;
    private boolean adminUser;

    User(String name, String surname, int years) {
        this.name = name;
        this.surname = surname;
        this.years = years;
    }

    public User() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public boolean isAdminUser() {
        return adminUser;
    }

    public void setAdminUser(boolean adminUser) {
        this.adminUser = adminUser;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
               // "name='" + name + '\'' +
              //  ", surname='" + surname + '\'' +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", years=" + years +
                ", adminUser=" + adminUser +
                '}';
    }
}
