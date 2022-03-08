package com.company;

public class TestStudent {

    public static void main(String[] args) {
        TestStudent test = new TestStudent();
        test.runStudentObjectTest();
    }
    private void runStudentObjectTest()
    {
        Student student = new Student();
        printInfo(student);
        student.setName("Unknown Entity");
        student.setId("56b1");
        student.setPhoneNumber(56823496);
        student.setIsTutor(false);
        student.setGrade(7);
        printInfo(student);
        Student student2 = new Student();
        student2.setName("Rasmus");
        student2.setId("40l2");
        student2.setPhoneNumber(84028575);
        student2.setIsTutor(true);
        student.setGrade(10);
        printInfo(student2);
    }
    private void printInfo(Student student)
    {
        if (student.getIsTutor()) { System.out.println("Tutor:"); }
        else { System.out.println("Student:"); }
        System.out.println("Name: " + student.getName());
        System.out.println("Id: " + student.getId());
        System.out.println("Phone number: " + student.getPhoneNumber());
        System.out.println("Grade: " + student.getGrade());
    }
}
