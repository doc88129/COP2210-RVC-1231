/*
	* Author: Anthony Orozco
	* Course: COP 2210 RVC 1231
	* Date: 2/6/2023
	* Assignment: 6.1 Lab (H)
	* Instructor: Sergio Pisano
	* Description: Grade Calculator
*/

import java.util.Scanner;

public class ProgramLab {
   public static void main(String[] args) {
	   final double HOMEWORK_MAX = 800.0;
	   final double QUIZZES_MAX = 400.0;
	   final double MIDTERM_MAX = 150.0;
	   final double FINAL_MAX = 200.0; 
	   
	   Scanner scnr = new Scanner(System.in);
	   
	   String studentStatus = scnr.next();
	   Double homeworkPts = scnr.nextDouble();
	   Double quizPts = scnr.nextDouble();
	   Double midtermPts = scnr.nextDouble();
	   Double finalPts = scnr.nextDouble();
	   
	   if (studentStatus.compareTo("UG") != 0 && studentStatus.compareTo("G") != 0 && studentStatus.compareTo("DL") != 0) {
		   System.out.println("Error: student status must be UG, G or DL");
	   } else {
		   Double homeworkPercent = homeworkPts / HOMEWORK_MAX > 1.0 ? 100.0 : 100.0 * (homeworkPts / HOMEWORK_MAX);
		   Double quizPercent = quizPts / QUIZZES_MAX > 1.0 ? 100.0 : 100.0 * (quizPts / QUIZZES_MAX);
		   Double midtermPercent = midtermPts / MIDTERM_MAX > 1.0 ? 100.0 : 100.0 * (midtermPts / MIDTERM_MAX);
		   Double finalPercent = finalPts / FINAL_MAX > 1.0 ? 100.0 : 100.0 * (finalPts / FINAL_MAX);
		   
		   System.out.println(String.format("Homework: %.1f", homeworkPercent) + "%");
		   System.out.println(String.format("Quizzes: %.1f", quizPercent) + "%");
		   System.out.println(String.format("Midterm: %.1f", midtermPercent) + "%");
		   System.out.println(String.format("Final Exam: %.1f", finalPercent) + "%");
		   
		   Double gradeAverage = 0.0;
		   switch (studentStatus) {
		   		case "UG": {
		   			gradeAverage = homeworkPercent * 0.2 + quizPercent * 0.2 + midtermPercent * 0.3 + finalPercent * 0.3;
		   			break;
		   		}
		   		case "G": {
		   			gradeAverage = homeworkPercent * 0.15 + quizPercent * 0.05 + midtermPercent * 0.35 + finalPercent * 0.45;
		   			break;
		   		}
		   		case "DL": {
		   			gradeAverage = homeworkPercent * 0.05 + quizPercent * 0.05 + midtermPercent * 0.4 + finalPercent * 0.5;
		   			break;
		   		}
		   }
	
		   System.out.println(String.format("%s average: %.1f", studentStatus, gradeAverage) + "%");
		   
		   if (gradeAverage >= 90.0) {
			   System.out.println("Course grade: A");
		   } else if (gradeAverage >= 80.0) {
			   System.out.println("Course grade: B");
		   } else if (gradeAverage >= 70.0) {
			   System.out.println("Course grade: C");
		   } else if (gradeAverage >= 60.0) {
			   System.out.println("Course grade: D");
		   } else {
			   System.out.println("Course grade: F");
		   }
	   }
   }
}

/* CODE OUTPUT IN ECLIPSE: 
Homework: 75.0%
Homework: 75.0%
Homework: 80.0%
Homework: 75.0%
DL average: 77.0%
Course grade: C

*/
