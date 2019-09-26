package com.projectTrack.demo;

public class User {
    private int id;
    private String fullName;
    private String userName;
    private String email;

    public User(String userName, String email, String firstName, String lastName, int id){
        this.id = id;
        this.userName = userName;
        this.email = email;
        this.fullName= fullName;
    }

    public User(String userName, String email, String fullName) {
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    @Override
    public String toString(){
        return fullName+
                "\n "+ userName+
                "\n "+email;
    }
}
