package decisionStructures;

import java.util.Scanner;

public class gradeCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double testAverage = 99.0;
		int teacher = 1;
		double hwAverage = 99.0;
		System.out.println("What is you average test score");
		testAverage = input.nextDouble();
		System.out.println("What is your homework average");
		hwAverage = input.nextDouble();
		System.out.println("Is your teacher nice(say 1 for yes 2 for no)");
		teacher = input.nextInt();
		if (teacher == 1) {

			if (testAverage > hwAverage) {
				System.out.println("You final score is" + testAverage);
			
				}
				if (hwAverage > testAverage) {
					System.out.println("Your score is " + hwAverage);
				}
			}
	
		
	if(teacher==2) {
		if(testAverage<hwAverage);
		System.out.println("your final score is" + testAverage);
	}
	if(hwAverage<testAverage) {
		System.out.println("your final score is" + hwAverage);
	}
	}
	
}

