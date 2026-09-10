# Task-GP
DEPI assignments
# Student Management System — Batch Administration Project

An Object-Oriented Java Student Management System developed for the Digital Egypt Pioneers Initiative (DEPI) Software Testing track[cite: 1]. This application manages student records, course allocations, class isolation, and statistical grade processing for a 50-student cohort[cite: 1].

---

## 1. Project Overview

This system manages an academic batch of **50 students** partitioned into two isolated administrative units: **Class A** (25 students) and **Class B** (25 students)[cite: 1]. 

The application automates student enrollment, enforces class-specific elective rules, guarantees data encapsulation, and maps individual performance percentages against a mandatory statistical grade distribution model[cite: 1].

---

## 2. System Requirements & Academic Specifications

### 2.1 Batch Partitioning & ID Formatting
* **Total Batch Capacity:** 50 Students[cite: 1].
* **Class Isolation:** Two distinct classes containing 25 students each[cite: 1].
* **Student Identifier Scheme:**
  * **Class A Identifiers:** Sequential tracking from `A01` through `A25`[cite: 1].
  * **Class B Identifiers:** Sequential tracking from `B01` through `B25`[cite: 1].
* **Personal Data Attributes:** First Name, Last Name, Class Group, and System ID[cite: 1].

### 2.2 Course Allocation Model
Every student is enrolled in core subjects alongside class-specific STEM electives and second language tracks[cite: 1]:

* **Main Core Courses (Mandatory for All 50 Students):**
  * Arabic[cite: 1]
  * English[cite: 1]
* **STEM Elective Track (Math vs. Science):**
  * **Class A (25 Students):** 20 Math / 5 Science[cite: 1].
  * **Class B (25 Students):** 0 Math / 25 Science[cite: 1].
* **Second Language Option Track (French vs. Dutch):**
  * **Class A (25 Students):** 20 French / 5 Dutch[cite: 1].
  * **Class B (25 Students):** 5 French / 20 Dutch[cite: 1].

### 2.3 Required Grade Distribution Framework
Student grades are allocated to match an exact statistical breakdown across the 50-student batch[cite: 1]:

| Grade Performance Bracket | Targeted Batch % | Calculated Student Count |
| :--- | :--- | :--- |
| **Above 95%** | 1% | 1 Student[cite: 1] |
| **Above 90%** | 20% | 10 Students[cite: 1] |
| **Above 85%** | 30% | 15 Students[cite: 1] |
| **Above 80%** | 25% | 12 Students[cite: 1] |
| **Above 70%** | 20% | 10 Students[cite: 1] |
| **Fail (Below 70%)** | 4% | 2 Students[cite: 1] |
| **Total Cohort** | **100%** | **50 Students**[cite: 1] |

---

## 3. System Architecture & Object-Oriented Design

The architecture enforces object-oriented principles to ensure complete decoupling between class rosters and secure state management[cite: 1].
+-----------------------------------------------------------------------+|                         BATCH MANAGEMENT SYSTEM                        |+-----------------------------------------------------------------------+|+-------------------------+-------------------------+|                                                   |v                                                   v+------------------+                               +------------------+|     CLASS A      |                               |     CLASS B      ||  (25 Students)   |                               |  (25 Students)   |+------------------+                               +------------------+|                                                   |+-------------------------+-------------------------+|v+-----------------------------------------------------------------------+
STUDENT ENTITY- Private Attributes: ID, First Name, Last Name, Class, Grade, List- Public Methods: Enroll Course, Set Grade, Categorize Tier+-----------------------------------------------------------------------+
### 3.1 Key OOP Principles Applied
1. **Encapsulation:** Sensitive fields (`id`, `firstName`, `lastName`, `gradePercentage`, `courses`) are kept `private`[cite: 1]. Access and modifications occur strictly through public getters and mutators[cite: 1].
2. **Class Isolation:** Separate collection containers manage Class A and Class B independently, preventing roster leaks or cross-contamination[cite: 1].
3. **Dynamic Collections:** Dynamic list collections handle course enrollments per student without hardcoded array limits.

---

## 4. Execution Flow & System Workflow

1. **Class A Population:**
   * Create 25 student entities assigned IDs `A01` through `A25`[cite: 1].
   * Enroll all in core courses (**Arabic**, **English**)[cite: 1].
   * Assign **Math** (Students 1–20) and **Science** (Students 21–25)[cite: 1].
   * Assign **French** (Students 1–20) and **Dutch** (Students 21–25)[cite: 1].

2. **Class B Population:**
   * Create 25 student entities assigned IDs `B01` through `B25`[cite: 1].
   * Enroll all in core courses (**Arabic**, **English**)[cite: 1].
   * Assign **Science** to all 25 students (0 Math)[cite: 1].
   * Assign **French** (Students 1–5) and **Dutch** (Students 6–25)[cite: 1].

3. **Grade Evaluation & Validation:**
   * Generate a 50-item grade pool matching required statistical thresholds[cite: 1].
   * Map performance values to individual student records[cite: 1].
   * Output independent class rosters and execute aggregate validation audits[cite: 1].

---

## 5. Verification & Audit Results

### 5.1 Enrollment Audit Matrix

| Course Name | Class A Count | Class B Count | Total Enrolled Batch | Status |
| :--- | :--- | :--- | :--- | :--- |
| **Arabic** | 25 | 25 | 50 | Verified (100%)[cite: 1] |
| **English** | 25 | 25 | 50 | Verified (100%)[cite: 1] |
| **Math** | 20 | 0 | 20 | Verified (100%)[cite: 1] |
| **Science** | 5 | 25 | 30 | Verified (100%)[cite: 1] |
| **French** | 20 | 5 | 25 | Verified (100%)[cite: 1] |
| **Dutch** | 5 | 20 | 25 | Verified (100%)[cite: 1] |

### 5.2 Grade Distribution Audit Matrix

| Category Tier | Target % | Expected Count | Actual System Count | Audit Result |
| :--- | :--- | :--- | :--- | :--- |
| **Above 95%** | 1% | 1 | 1 | PASS[cite: 1] |
| **Above 90%** | 20% | 10 | 10 | PASS[cite: 1] |
| **Above 85%** | 30% | 15 | 15 | PASS[cite: 1] |
| **Above 80%** | 25% | 12 | 12 | PASS[cite: 1] |
| **Above 70%** | 20% | 10 | 10 | PASS[cite: 1] |
| **Fail (<70%)** | 4% | 2 | 2 | PASS[cite: 1] |

---

## 6. How to Build and Run

### Prerequisites
* **Java Development Kit (JDK):** Version 8 or higher.

### Compilation & Execution Commands

1. **Clone the repository:**
   ```bash
   git clone [https://github.com/your-username/student-management-system.git](https://github.com/your-username/student-management-system.git)
   cd student-management-system
