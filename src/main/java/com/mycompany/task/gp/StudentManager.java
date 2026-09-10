
package com.mycompany.task.gp;import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Handles CRUD operations for Student records
public class StudentManager {
    private List<Student> students = new ArrayList<>();

    // Add Student Record
    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student " + student.getFullName() + " added successfully.");
    }

    // Edit Student Record
    public boolean editStudent(String id, String newFirstName, String newLastName, String newClassName) {
        Student student = findStudentById(id);
        if (student != null) {
            student.setFirstName(newFirstName);
            student.setLastName(newLastName);
            student.setClassName(newClassName);
            System.out.println("Student ID " + id + " updated successfully.");
            return true;
        }
        System.out.println("Student ID " + id + " not found.");
        return false;
    }

    // Delete Student Record
    public boolean deleteStudent(String id) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student s = iterator.next();
            if (s.getId().equalsIgnoreCase(id)) {
                iterator.remove();
                System.out.println("Student ID " + id + " deleted successfully.");
                return true;
            }
        }
        System.out.println("Student ID " + id + " not found.");
        return false;
    }

    // Utility lookup method
    public Student findStudentById(String id) {
        for (Student s : students) {
            if (s.getId().equalsIgnoreCase(id)) {
                return s;
            }
        }
        return null;
    }

    public List<Student> getAllStudents() {
        return students;
    }
}