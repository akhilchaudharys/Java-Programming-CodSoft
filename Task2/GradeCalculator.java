import java.util.Scanner;

public class GradeCalculator {

	public static void main(String[] args) {
	
		// Creating a Scanner object to read user input
		        Scanner sc = new Scanner(System.in);

		        //  Getting the number of subjects from the user
		        System.out.println("Enter the number of subjects: ");
		        int numOfSubjects = sc.nextInt();

		        // Array to store the marks obtained in each subject
		        int[] marks = new int[numOfSubjects];

		        // Prompt the user to enter the marks obtained in each subject
		        for (int i = 0; i < numOfSubjects; i++) {
		            System.out.println("Enter the marks obtained out of 100 in subject " + (i + 1) + ": ");
		            marks[i] = sc.nextInt();
		        }

		        // Calculate the total marks
		        int totalMark = 0;
		        for (int mark : marks) {
		            totalMark += mark;
		        }

		        // Calculating the average percentage
		        float avgPercentage = (float) totalMark / numOfSubjects;

		        // Assign a grade based on the average percentage
		        String grade;
		        if (avgPercentage >= 90) {
		            grade = "A";
		        } else if (avgPercentage >= 80) {
		            grade = "B";
		        } else if (avgPercentage >= 70) {
		            grade = "C";
		        } else if (avgPercentage >= 60) {
		            grade = "D";
		        } else {
		            grade = "F";
		        }

		        // Display the results
		        System.out.println("Total marks: " + totalMark+"/"+(numOfSubjects*100));
		        System.out.println("Average percentage: " + avgPercentage);
		        System.out.println("Grade: " + grade);

		        // Close the Scanner object
		        sc.close();
		    }
		}

		