
package com.mycompany.task.gp;

import java.util.ArrayList;
import java.util.List;

// Encapsulates individual student records, grade tracking, and calculations
public class Student {
    private String id;
    private String firstName;
    private String lastName;
    private String className;
    private List<Grade> grades;

    public Student(String id, String firstName, String lastName, String className) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.className = className;
        this.grades = new ArrayList<>();
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getFullName() { return firstName + " " + lastName; }

    public String getClassName() { return className; }
    public void setClassName(String className) { this.className = className; }

    public List<Grade> getGrades() { return grades; }

    // Record grade method
    public void recordGrade(Course course, double score) {
        for (Grade g : grades) {
            if (g.getCourse().getCourseCode().equalsIgnoreCase(course.getCourseCode())) {
                g.setScore(score);
                return;
            }
        }
        grades.add(new Grade(course, score));
    }

    // Grade calculation method
    public double calculateAverageGrade() {
        if (grades.isEmpty()) return 0.0;
        double sum = 0;
        for (Grade g : grades) {
            sum += g.getScore();
        }
        return sum / grades.size();
    }

    public String getGradeCategory() {
        double avg = calculateAverageGrade();
        if (avg > 95) return "Above 95%";
        if (avg > 90) return "Above 90%";
        if (avg > 85) return "Above 85%";
        if (avg > 80) return "Above 80%";
        if (avg > 70) return "Above 70%";
        return "Fail";
    }

    public void displayStudentInfo() {
        System.out.printf("ID: %-5s | Name: %-18s | Class: %-7s | Average Grade: %5.1f%% (%s)%n", 
                id, getFullName(), className, calculateAverageGrade(), getGradeCategory());
        System.out.print("   Enrolled Courses & Scores: ");
        if (grades.isEmpty()) {
            System.out.println("No courses assigned.");
        } else {
            List<String> details = new ArrayList<>();
            for (Grade g : grades) {
                details.add(g.getCourse().getCourseName() + ": " + g.getScore() + "%");
            }
            System.out.println(String.join(", ", details));
        }
    }
}