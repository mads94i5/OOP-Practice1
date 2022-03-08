package com.company;

public class Student {
    private String name = "Mads Kristian Pedersen";
    private String id = "94i5";
    private int phoneNumber = 42201763;

    public String getName() {
        return name;
    }
    public void setName(String newName) {
        this.name = newName;
    }
    public String getId() {
        return id;
    }
    public void setId(String newId) {
        this.id = newId;
    }
    public int getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(int newNumber) {
        this.phoneNumber = newNumber;
    }
}
