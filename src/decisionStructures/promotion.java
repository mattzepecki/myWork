package decisionStructures;

import java.util.Scanner;

public class promotion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int age=67;
		double yearsExperience=34;
		double height=678;
		System.out.println("how old are you");
		age=input.nextInt();
		System.out.println("how many years of experience do u have");
		yearsExperience=input.nextDouble();
		System.out.println("how tall are you");
		height=input.nextDouble();
		if(age>=50&&yearsExperience==10.5&&height<70) {
			System.out.println("you get a promotion");}
			else {
				if(age>=50&&yearsExperience==10.5&&height>80) {
					System.out.println("you get a promotion");
			}
				else {
					if(age<50&&height>=70&&height<=80) {
						System.out.println("you get a promotion");
					}
					else {
						System.out.println("no promotion fo u");
					}
				}
				
		}
		}

}
