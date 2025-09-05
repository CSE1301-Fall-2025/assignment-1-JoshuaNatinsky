package src.assignment01;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Name: ");
        String name = in.next();
        System.out.println("Studios Attended: ");
        int studiosAttended = in.nextInt();
        System.out.println("Average Quiz Grade: ");
        double averageQuizGrade = in.nextDouble();
        System.out.println("Average Exam Grade: ");
        double averageExamGrade = in.nextDouble();

        double weightedStudioGrade = (studiosAttended / 8.0) * 15.0;
        double weightedQuizGrade = averageQuizGrade / 4.0;
        double weightedExamGrade = averageExamGrade * 0.6;

        double weightedStudioGradeRounded = Math.round(weightedStudioGrade*100);
        double weightedQuizGradeRounded = Math.round(weightedQuizGrade*100);
        double weightedExamGradeRounded = Math.round(weightedExamGrade*100);

        double totalGrade = weightedExamGrade + weightedQuizGrade + weightedStudioGrade;

        double totalGradeRounded = Math.round(totalGrade*10);

        System.out.println("CSE131 Grade for: " + name);
        System.out.println("Number of studios attended: " + studiosAttended);
        System.out.println("Weighted studio grade (out of 15): " + weightedStudioGradeRounded/100 + "%");
        System.out.println("Average quiz grade: " + averageQuizGrade);
        System.out.println("Weighted quiz grade (out of 25): " + weightedQuizGradeRounded/100 + "%");
        System.out.println("Average exam grade: " + averageExamGrade);
        System.out.println("Weighted exam grade (out of 60): " + weightedExamGradeRounded/100 + "%");
        System.out.println("Total Grade: " + totalGradeRounded/10 + "%");


    }
}
