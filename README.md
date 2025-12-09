# Student Report Card System (Java)

This is a simple **Java console application** that generates a **Student Report Card System**.  
It collects student details, calculates totals, assigns ranks, computes class statistics, and prints a formatted report table.

---

## 📌 Features
- Input school details (School Name, Teacher, Grade, Year)
- Input student marks for:
  - English  
  - Math  
  - History  
  - Geography  
  - Science  
  - Programming
- Automatically calculates:
  - Total marks per student
  - Rank (A, B, C, D, F)
- Computes class statistics:
  - Subject totals
  - Subject averages
  - Number of students with each rank
- Displays a clean, formatted report card table

---

## 🛠️ How It Works
1. The program uses **arrays** to store marks for each student.  
2. Totals are computed with standard arithmetic.  
3. A `switch` statement counts ranks.  
4. Output is displayed using **printf() formatting** for a clean tabular layout.

---

## 📥 Requirements
- Java JDK 8+
- A terminal or IDE (VS Code, IntelliJ, Eclipse, etc.)

---

## ▶️ How to Run
1. Save the file as:

```
StudentReportCardSystem.java
```

2. Compile the Java program:

```
javac StudentReportCardSystem.java
```

3. Run the application:

```
java StudentReportCardSystem
```

---

## 📄 Sample Functionality Flow
- The system prompts for school details.  
- For each student (default: 2), you enter:
  - Name  
  - Marks for each subject  
- The program generates:
  - Per-student scores
  - Total score
  - Rank  
  - Class subject totals and averages  
  - Count of A’s, B’s, C’s, etc.

---

## 📝 Grade Logic
| Total Marks | Rank |
|-------------|------|
| ≥ 540       | A    |
| ≥ 480       | B    |
| ≥ 420       | C    |
| ≥ 360       | D    |
| < 360       | F    |

---

## 📊 Output Example (Simplified)

<img width="880" height="535" alt="image" src="https://github.com/user-attachments/assets/6c2c7c0b-3f44-4c1b-bced-fddc9cd287b6" />

---

## 📌 Customization
You can modify:
- Number of students:  
  `int STUDENTS = 2;`
- Ranking thresholds
- Subjects included
- Report formatting (printf layout)

---

## ✔️ Author
Kelvin — Java student project  

---

Feel free to expand this program into a full GUI-based system later!



