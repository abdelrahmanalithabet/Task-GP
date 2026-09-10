# Student Management System — Batch Administration Project

An Object-Oriented Java Student Management System developed for the Digital Egypt Pioneers Initiative (DEPI) Software Testing track. This application provides complete administrative capabilities, including student and course management (CRUD), instructor assignment, class isolation, and statistical grade processing for a 50-student cohort.

---

## 1. Project Overview

This repository contains an academic management application designed to handle a batch of **50 students** divided equally into two isolated administrative units: **Class A** (25 students) and **Class B** (25 students). 

The system automates student registration, course setup with assigned instructors, grade recording and average calculation, and performance mapping against a mandatory statistical grade distribution model.

---

## 2. Core Capabilities & Administrative Features

* **Student Management (CRUD):** Methods to add, edit (first name, last name, class), and delete student records.
* **Course Management (CRUD):** Methods to add, edit (course name, assigned instructor), and delete course offerings.
* **Instructor Integration:** Tracks faculty details (First Name, Last Name) assigned to specific courses.
* **Grade Recording & Calculation:** Records individual subject scores per student, computes overall average grade percentage, and categorizes performance tiers.
* **Class Roster Isolation:** Independent container management for Class A and Class B rosters preventing roster leakage.

---

## 3. Academic Specifications & Requirements

### 3.1 Batch Partitioning & Identifier Rules
* **Total Cohort Size:** 50 Students.
* **Class Isolation:** Two separate classes containing 25 students each.
* **Naming & ID Scheme:**
  * **Class A Identifiers:** `A01` through `A25`.
  * **Class B Identifiers:** `B01` through `B25`.
* **Personal Attributes:** First Name, Last Name, Class Group, and Unique ID.

### 3.2 Course Allocation Model
Every student is enrolled in core courses alongside specific STEM electives and second language options:

* **Core Courses (Mandatory for all 50 students):**
  * Arabic.
  * English.
* **STEM Elective Track (Math vs. Science):**
  * **Class A:** 20 Math / 5 Science.
  * **Class B:** 0 Math / 25 Science.
* **Second Language Option Track (French vs. Dutch):**
  * **Class A:** 20 French / 5 Dutch.
  * **Class B:** 5 French / 20 Dutch.

### 3.3 Target Grade Distribution Framework

| Performance Tier | Target Batch % | Calculated Student Count |
| :--- | :--- | :--- |
| **Above 95%** | 1% | 1 Student |
| **Above 90%** | 20% | 10 Students |
| **Above 85%** | 30% | 15 Students |
| **Above 80%** | 25% | 12 Students |
| **Above 70%** | 20% | 10 Students |
| **Fail (Below 70%)** | 4% | 2 Students |
| **Total Cohort** | **100%** | **50 Students** |

---

## 4. System Architecture & Object-Oriented Design
+-----------------------------------------------------------------------+
|                         BATCH MANAGEMENT SYSTEM                        |
+-----------------------------------------------------------------------+
|
+-------------------------+-------------------------+
|                                                   |
v                                                   v
+------------------+                               +------------------+
| STUDENT MANAGER  |                               |  COURSE MANAGER  |
|  (Add/Edit/Del)  |                               |  (Add/Edit/Del)  |
+------------------+                               +------------------+
|                                                   |
+-------------------------+-------------------------+
|
v
+-----------------------------------------------------------------------+
STUDENT ENTITY
- Attributes: ID, First Name, Last Name, Class Name, List
- Methods: Record Grade, Calculate Average Grade, Categorize Tier
+-----------------------------------------------------------------------+
|
                               v
+-----------------------------------------------------------------------+COURSE & INSTRUCTOR- Course: Code, Name, Instructor- Instructor: First Name, Last Name+-----------------------------------------------------------------------+
### 4.1 Key OOP Principles Applied
1. **Encapsulation:** Sensitive fields are kept `private` and accessed strictly through public accessors and mutators.
2. **Class Isolation:** Separate collection containers manage Class A and Class B rosters independently.
3. **Modular Management (Single Responsibility):** Dedicated `StudentManager` and `CourseManager` classes handle operational logic and CRUD execution.
4. **Dynamic Collections:** `ArrayList` structures dynamically accommodate enrollments and roster lists without fixed array boundaries.

---

## 5. Directory & Class Structure

* `Instructor.java` — Represents faculty members (First Name, Last Name).
* `Course.java` — Defines course details and associated instructor assignments.
* `Grade.java` — Maps individual course entities to student percentage scores.
* `Student.java` — Core student entity; handles grade entries and average grade calculation.
* `StudentManager.java` — Handles adding, editing, deleting, and searching student records.
* `CourseManager.java` — Handles adding, editing, deleting, and listing courses.
* `ClassGroup.java` — Container for managing isolated administrative class rosters.
* `BatchManagementSystem.java` — Main application driver demonstrating system initialization and features.

---

## 6. How to Build and Run

### Prerequisites
* **Java Development Kit (JDK):** Version 8 or higher.

### Terminal Commands

1. **Clone the repository:**
   ```bash
   git clone [https://github.com/abdelrahmanalithabet/student-management-system.git](https://github.com/abdelrahmanalithabet/student-management-system.git)
   cd student-management-system
