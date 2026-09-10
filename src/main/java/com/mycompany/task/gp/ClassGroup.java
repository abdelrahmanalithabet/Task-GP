
package com.mycompany.task.gp;

import java.util.ArrayList;
import java.util.List;

// Handles isolated class rosters
public class ClassGroup {
    private String className;
    private List<Student> students;

    public ClassGroup(String className) {
        this.className = className;
        this.students = new ArrayList<>();
    }

    public String getClassName() { return className; }

    public void addStudent(Student student) {
        students.add(student);
    }

    public List<Student> getStudents() { return students; }

    public void displayRoster() {
        System.out.println("========================================================================");
        System.out.println("                         " + className.toUpperCase() + " ROSTER                        ");
        System.out.println("========================================================================");
        for (Student student : students) {
            student.displayStudentInfo();
        }
    }
}