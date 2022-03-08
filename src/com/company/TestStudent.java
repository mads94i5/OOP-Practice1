package com.company;

public class TestStudent {

    public static void main(String[] args) {
        TestStudent test = new TestStudent();
        test.runStudentObjectTest();
    }
    private void runStudentObjectTest()
    {
        Student student = new Student();
        printStudentInfo(student);
        student.setName("Unknown Entity");
        student.setId("56b1");
        student.setPhoneNumber(56823496);
        printStudentInfo(student);
    }
    private void printStudentInfo(Student student)
    {
        System.out.println("Student name: " + student.getName());
        System.out.println("Student id: " + student.getId());
        System.out.println("Student phone number: " + student.getPhoneNumber());
    }
}
