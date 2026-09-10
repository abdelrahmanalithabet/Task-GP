
package com.mycompany.task.gp;import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Handles CRUD operations for Course records
public class CourseManager {
    private List<Course> courses = new ArrayList<>();

    // Add Course Record
    public void addCourse(Course course) {
        courses.add(course);
        System.out.println("Course " + course.getCourseName() + " added successfully.");
    }

    // Edit Course Record
    public boolean editCourse(String courseCode, String newCourseName, Instructor newInstructor) {
        Course course = findCourseByCode(courseCode);
        if (course != null) {
            course.setCourseName(newCourseName);
            course.setInstructor(newInstructor);
            System.out.println("Course Code " + courseCode + " updated successfully.");
            return true;
        }
        System.out.println("Course Code " + courseCode + " not found.");
        return false;
    }

    // Delete Course Record
    public boolean deleteCourse(String courseCode) {
        Iterator<Course> iterator = courses.iterator();
        while (iterator.hasNext()) {
            Course c = iterator.next();
            if (c.getCourseCode().equalsIgnoreCase(courseCode)) {
                iterator.remove();
                System.out.println("Course Code " + courseCode + " deleted successfully.");
                return true;
            }
        }
        System.out.println("Course Code " + courseCode + " not found.");
        return false;
    }

    // Utility lookup method
    public Course findCourseByCode(String courseCode) {
        for (Course c : courses) {
            if (c.getCourseCode().equalsIgnoreCase(courseCode)) {
                return c;
            }
        }
        return null;
    }

    public List<Course> getAllCourses() {
        return courses;
    }

    public void displayAllCourses() {
        System.out.println("========================================================================");
        System.out.println("                           AVAILABLE COURSES                            ");
        System.out.println("========================================================================");
        for (Course c : courses) {
            c.displayCourseDetails();
        }
    }
}