package com.company;

public class Student {
    private String name = "Mads Kristian Pedersen";
    private String id = "94i5";
    private int phoneNumber = 42201763;
    private boolean isTutor = false;
    private int grade = 12;

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
    public boolean getIsTutor() {
        return isTutor;
    }
    public void setIsTutor(boolean isTutor) {
        this.isTutor = isTutor;
    }
    public int getGrade() {
        return grade;
    }
    public void setGrade(int newGrade) {
        this.grade = newGrade;
    }
}
