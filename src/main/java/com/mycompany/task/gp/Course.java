
package com.mycompany.task.gp;
// Represents a course entity with an assigned instructor
public class Course {
    private String courseCode;
    private String courseName;
    private Instructor instructor;

    public Course(String courseCode, String courseName, Instructor instructor) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.instructor = instructor;
    }

    public String getCourseCode() { return courseCode; }
    public void setCourseCode(String courseCode) { this.courseCode = courseCode; }

    public String getCourseName() { return courseName; }
    public void setCourseName(String courseName) { this.courseName = courseName; }

    public Instructor getInstructor() { return instructor; }
    public void setInstructor(Instructor instructor) { this.instructor = instructor; }

    public void displayCourseDetails() {
        String instructorName = (instructor != null) ? instructor.getFullName() : "Unassigned";
        System.out.printf("Course Code: %-8s | Name: %-15s | Instructor: %s%n", 
                courseCode, courseName, instructorName);
    }
}