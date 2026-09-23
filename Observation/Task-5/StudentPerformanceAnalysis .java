package javacore;
import java.util.Scanner;

class Student {

    int rollNo;
    String name;
    int[] marks;

    // Constructor
    Student(int rollNo, String name, int[] marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    // Calculate total marks
    int calculateTotal() {
        int total = 0;

        for (int mark : marks) {
            total += mark;
        }

        return total;
    }

    // Calculate average
    double calculateAverage() {
        return (double) calculateTotal() / marks.length;
    }

    // Find highest mark
    int findHighest() {
        int highest = marks[0];

        for (int mark : marks) {
            highest = Math.max(highest, mark);
        }

        return highest;
    }

    // Find lowest mark
    int findLowest() {
        int lowest = marks[0];

        for (int mark : marks) {
            lowest = Math.min(lowest, mark);
        }

        return lowest;
    }

    // Calculate percentage
    double calculatePercentage() {
        return (double) calculateTotal() / (marks.length * 100) * 100;
    }

    // Determine grade
    String calculateGrade() {
        double percentage = calculatePercentage();

        if (percentage >= 90)
            return "A+";
        else if (percentage >= 80)
            return "A";
        else if (percentage >= 70)
            return "B";
        else if (percentage >= 60)
            return "C";
        else if (percentage >= 50)
            return "D";
        else
            return "F";
    }

    // Display student details
    void displayDetails() {

        String formattedName = name.trim().toUpperCase();

        double percentage = calculatePercentage();
        double roundedPercentage = Math.round(percentage * 100.0) / 100.0;

        String grade = calculateGrade();

        System.out.println("\n STUDENT PERFORMANCE REPORT ");
        System.out.println("Roll Number       : " + rollNo);
        System.out.println("Student Name      : " + formattedName);
        System.out.println("Name Length       : " + formattedName.length());

        System.out.println("Total Marks       : " + calculateTotal());
        System.out.println("Average Marks     : " + calculateAverage());
        System.out.println("Highest Marks     : " + findHighest());
        System.out.println("Lowest Marks      : " + findLowest());
        System.out.println("Percentage        : " + roundedPercentage + "%");
        System.out.println("Grade             : " + grade);

        if (percentage >= 50)
            System.out.println("Result  : PASS");
        else
            System.out.println("Result  : FAIL");

        // Performance remark
        if (percentage >= 90)
            System.out.println("Performance       : Excellent");
        else if (percentage >= 80)
            System.out.println("Performance       : Very Good");
        else if (percentage >= 70)
            System.out.println("Performance       : Good");
        else if (percentage >= 50)
            System.out.println("Performance       : Satisfactory");
        else
            System.out.println("Performance       : Needs Improvement");
    }
}

public class StudentPerformanceAnalysis {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Roll Number: ");
        int rollNo = sc.nextInt();

        sc.nextLine(); // consume newline

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        int[] marks = new int[5];

        System.out.println("Enter marks for 5 subjects:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }

        // Create Student object
        Student student = new Student(rollNo, name, marks);

        // Display performance report
        student.displayDetails();

        sc.close();
    }
}
/*output
Enter Roll Number: 98
Enter Student Name: riya
Enter marks for 5 subjects:
Subject 1: 78
Subject 2: 98
Subject 3: 87
Subject 4: 96
Subject 5: 89

 STUDENT PERFORMANCE REPORT 
Roll Number       : 98
Student Name      : RIYA
Name Length       : 4
Total Marks       : 448
Average Marks     : 89.6
Highest Marks     : 98
Lowest Marks      : 78
Percentage        : 89.6%
Grade             : A
Result  : PASS
Performance       : Very Good*/

