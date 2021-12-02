package com.org;

import java.util.Scanner;

public class StudentView {
    private int studentId;

    /**
     * This method takes the input from user directly.
    **/
    public void getInputFromUser()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the ID of the student whose " +
                "info you'd like to see.");
        studentId = scanner.nextInt();
    }

    /**
     * This method is used by controller to get the student id that the
     * user entered.
    **/
    public int getStudentId()
    {
        return studentId;
    }

    /**
     * This method prints information related to the student ID the
     * user has requested.
     * @param studentName The name of the student the user has requested
     * @param studentSemester The semester of the student the user has
     *                        requested
     **/
    public void printStudentDetails(String studentName,
                                    String studentSemester)
    {
        System.out.println("Student Info: ");
        System.out.println("Name: " + studentName);
        System.out.println("Semester: " + studentSemester);
    }
}
