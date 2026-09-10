
package com.mycompany.task.gp;
// Stores individual course grades for students
public class Grade {
    private Course course;
    private double score;

    public Grade(Course course, double score) {
        this.course = course;
        this.score = score;
    }

    public Course getCourse() { return course; }
    public void setCourse(Course course) { this.course = course; }

    public double getScore() { return score; }
    public void setScore(double score) { this.score = score; }
}