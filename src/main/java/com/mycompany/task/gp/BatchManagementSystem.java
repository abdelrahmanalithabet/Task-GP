
package com.mycompany.task.gp;

import java.util.*;

// Main application execution driver
public class BatchManagementSystem {

    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();
        CourseManager courseManager = new CourseManager();

        // 1. Create Instructors (First Name, Last Name)
        Instructor inst1 = new Instructor("Mina", "Younan");
        Instructor inst2 = new Instructor("Ahmed", "Hassan");
        Instructor inst3 = new Instructor("Sarah", "Connor");
        Instructor inst4 = new Instructor("Luc", "Dubois");

        // 2. Add Courses
        Course arabic = new Course("CS101", "Arabic", inst1);
        Course english = new Course("CS102", "English", inst2);
        Course math = new Course("CS103", "Math", inst1);
        Course science = new Course("CS104", "Science", inst3);
        Course french = new Course("CS105", "French", inst4);
        Course dutch = new Course("CS106", "Dutch", inst2);

        courseManager.addCourse(arabic);
        courseManager.addCourse(english);
        courseManager.addCourse(math);
        courseManager.addCourse(science);
        courseManager.addCourse(french);
        courseManager.addCourse(dutch);

        System.out.println();
        courseManager.displayAllCourses();
        System.out.println();

        // 3. Setup Groups
        ClassGroup classA = new ClassGroup("Class A");
        ClassGroup classB = new ClassGroup("Class B");

        // Grade Pool for exact 50-student percentage distribution
        double[] gradePool = new double[50];
        int idx = 0;
        gradePool[idx++] = 97.5; 
        for (int i = 0; i < 10; i++) gradePool[idx++] = 92.0; 
        for (int i = 0; i < 15; i++) gradePool[idx++] = 87.0; 
        for (int i = 0; i < 12; i++) gradePool[idx++] = 82.0; 
        for (int i = 0; i < 10; i++) gradePool[idx++] = 74.0; 
        for (int i = 0; i < 2; i++)  gradePool[idx++] = 55.0; 

        // 4. Populate Class A (25 Students)
        for (int i = 1; i <= 25; i++) {
            Student s = new Student("A" + String.format("%02d", i), "StudentA", "LastName" + i, "Class A");
            s.recordGrade(arabic, gradePool[(i - 1)]);
            s.recordGrade(english, gradePool[(i - 1)]);

            if (i <= 20) s.recordGrade(math, gradePool[(i - 1)]);
            else s.recordGrade(science, gradePool[(i - 1)]);

            if (i <= 20) s.recordGrade(french, gradePool[(i - 1)]);
            else s.recordGrade(dutch, gradePool[(i - 1)]);

            studentManager.addStudent(s);
            classA.addStudent(s);
        }

        // 5. Populate Class B (25 Students)
        for (int i = 1; i <= 25; i++) {
            Student s = new Student("B" + String.format("%02d", i), "StudentB", "LastName" + i, "Class B");
            s.recordGrade(arabic, gradePool[25 + (i - 1)]);
            s.recordGrade(english, gradePool[25 + (i - 1)]);
            s.recordGrade(science, gradePool[25 + (i - 1)]);

            if (i <= 5) s.recordGrade(french, gradePool[25 + (i - 1)]);
            else s.recordGrade(dutch, gradePool[25 + (i - 1)]);

            studentManager.addStudent(s);
            classB.addStudent(s);
        }

        // 6. Demonstrate Student Management (Edit & Delete)
        System.out.println("\n--- Testing Student & Course Management CRUD Operations ---");
        studentManager.editStudent("A01", "John", "Doe", "Class A");
        studentManager.deleteStudent("B25");

        // 7. Display Roster
        System.out.println();
        classA.displayRoster();
        System.out.println();
        classB.displayRoster();
    }
}