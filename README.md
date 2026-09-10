# Task-GP
DEPI assignments
# Student Management System — Batch Administration Project

An Object-Oriented Java Student Management System developed for the Digital Egypt Pioneers Initiative (DEPI) Software Testing track. This application manages student records, course allocations, class isolation, and statistical grade processing for a 50-student cohort.

---

## 1. Project Overview

This system manages an academic batch of **50 students** partitioned into two isolated administrative units: **Class A** (25 students) and **Class B** (25 students). 

The application automates student enrollment, enforces class-specific elective rules, guarantees data encapsulation, and maps individual performance percentages against a mandatory statistical grade distribution model.

---

## 2. System Requirements & Academic Specifications

### 2.1 Batch Partitioning & ID Formatting
* **Total Batch Capacity:** 50 Students.
* **Class Isolation:** Two distinct classes containing 25 students each.
* **Student Identifier Scheme:**
  * **Class A Identifiers:** Sequential tracking from `A01` through `A25`.
  * **Class B Identifiers:** Sequential tracking from `B01` through `B25`.
* **Personal Data Attributes:** First Name, Last Name, Class Group, and System ID.

### 2.2 Course Allocation Model
Every student is enrolled in core subjects alongside class-specific STEM electives and second language tracks:

* **Main Core Courses (Mandatory for All 50 Students):**
  * Arabic
  * English
* **STEM Elective Track (Math vs. Science):**
  * **Class A (25 Students):** 20 Math / 5 Science.
  * **Class B (25 Students):** 0 Math / 25 Science.
* **Second Language Option Track (French vs. Dutch):**
  * **Class A (25 Students):** 20 French / 5 Dutch.
  * **Class B (25 Students):** 5 French / 20 Dutch.

### 2.3 Required Grade Distribution Framework
Student grades are allocated to match an exact statistical breakdown across the 50-student batch:

| Grade Performance Bracket | Targeted Batch % | Calculated Student Count |
| :--- | :--- | :--- |
| **Above 95%** | 1% | 1 Student |
| **Above 90%** | 20% | 10 Students |
| **Above 85%** | 30% | 15 Students |
| **Above 80%** | 25% | 12 Students |
| **Above 70%** | 20% | 10 Students |
| **Fail (Below 70%)** | 4% | 2 Students |
| **Total Cohort** | **100%** | **50 Students** |

---

## 3. System Architecture & Object-Oriented Design

The architecture enforces object-oriented principles to ensure complete decoupling between class rosters and secure state management.+-----------------------------------------------------------------------+
|                         BATCH MANAGEMENT SYSTEM                        |
+-----------------------------------------------------------------------+
|
+-------------------------+-------------------------+
|                                                   |
v                                                   v
+------------------+                               +------------------+
|     CLASS A      |                               |     CLASS B      |
|  (25 Students)   |                               |  (25 Students)   |
+------------------+                               +------------------+
|                                                   |
+-------------------------+-------------------------+
|
v
+-----------------------------------------------------------------------+

STUDENT ENTITY- Private Attributes: ID, First Name, Last Name, Class, Grade, List- Public Methods: Enroll Course, Set Grade, Categorize Tier
+-----------------------------------------------------------------------+
### 3.1 Key OOP Principles Applied
1. **Encapsulation:** Sensitive fields (`id`, `firstName`, `lastName`, `gradePercentage`, `courses`) are kept `private`. Access and modifications occur strictly through public getters and mutators[cite: 1].
2. **Class Isolation:** Separate collection containers manage Class A and Class B independently, preventing roster leaks or cross-contamination.
3. **Dynamic Collections:** Dynamic list collections handle course enrollments per student without hardcoded array limits.

---

## 4. Execution Flow & System Workflow

1. **Class A Population:**
   * Create 25 student entities assigned IDs `A01` through `A25`.
   * Enroll all in core courses (**Arabic**, **English**).
   * Assign **Math** (Students 1–20) and **Science** (Students 21–25).
   * Assign **French** (Students 1–20) and **Dutch** (Students 21–25).

2. **Class B Population:**
   * Create 25 student entities assigned IDs `B01` through `B25`.
   * Enroll all in core courses (**Arabic**, **English**).
   * Assign **Science** to all 25 students (0 Math).
   * Assign **French** (Students 1–5) and **Dutch** (Students 6–25).

3. **Grade Evaluation & Validation:**
   * Generate a 50-item grade pool matching required statistical thresholds.
   * Map performance values to individual student records.
   * Output independent class rosters and execute aggregate validation audits.

---

## 5. Verification & Audit Results

### 5.1 Enrollment Audit Matrix

| Course Name | Class A Count | Class B Count | Total Enrolled Batch | Status |
| :--- | :--- | :--- | :--- | :--- |
| **Arabic** | 25 | 25 | 50 | Verified (100%) |
| **English** | 25 | 25 | 50 | Verified (100%) |
| **Math** | 20 | 0 | 20 | Verified (100%) |
| **Science** | 5 | 25 | 30 | Verified (100%) |
| **French** | 20 | 5 | 25 | Verified (100%) |
| **Dutch** | 5 | 20 | 25 | Verified (100%) |

### 5.2 Grade Distribution Audit Matrix

| Category Tier | Target % | Expected Count | Actual System Count | Audit Result |
| :--- | :--- | :--- | :--- | :--- |
| **Above 95%** | 1% | 1 | 1 | PASS |
| **Above 90%** | 20% | 10 | 10 | PASS |
| **Above 85%** | 30% | 15 | 15 | PASS |
| **Above 80%** | 25% | 12 | 12 | PASS |
| **Above 70%** | 20% | 10 | 10 | PASS |
| **Fail (<70%)** | 4% | 2 | 2 | PASS |

---

## 6. How to Build and Run

### Prerequisites
* **Java Development Kit (JDK):** Version 8 or higher.

### Compilation & Execution Commands

1. **Clone the repository:**
   ```bash
   git clone [https://github.com/your-username/student-management-system.git](https://github.com/your-username/student-management-system.git)
   cd student-management-system
