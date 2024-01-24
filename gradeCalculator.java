package Codsoft.java;

import java.util.Scanner;

public class gradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char grade;
        System.out.println("Enter mark for subject Math:");
        float math = sc.nextFloat();
        System.out.println("Enter mark for subject Science");
        float science=sc.nextFloat();
        System.out.println("Enter mark for subject Marathi");
        float marathi =sc.nextFloat();
        float total_marks= math+science+marathi;

        float average_percentage= total_marks/3;

        if(average_percentage>=90){
            grade='A';
        } else if (average_percentage>=80) {
            grade='B';

        } else if (average_percentage>=70) {
            grade='C';
        } else if (average_percentage>=60) {
           grade='D';
        } else if (average_percentage>=35) {
           grade='E';
        } else {
            grade='F';
        }
        System.out.println("\nResult:");
        System.out.println("Sum of marks obtained in all subjects="+total_marks);
        System.out.println("The sum of avearge is :"+average_percentage);
        System.out.println("Grade:"+grade);
    }
}

