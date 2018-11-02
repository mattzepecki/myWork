package decisionStructures;

import java.util.Scanner;

public class testClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);


	double  height=34;
	double  shoeSize=19;
	
	System.out.println("What is the height");
	 height = input.nextDouble();
	System.out.println("What is the shoe size");
	
	
	
	System.out.println(height==62 && shoeSize>9);
	}
	{
		Scanner input=new Scanner(System.in);
		
		System.out.println("How many pets do you have in your house?");
	double pets=input.nextDouble();
		System.out.println("how many cars will fit in your garage");
	double cars=input.nextDouble();
	  
	
	}
	{
	Scanner input=new Scanner(System.in);
	System.out.println("How old are you?");
	int age=input.nextInt();
	if(age>=18)
	{
		System.out.println("you are charged as a adult");
	}
	
	
	}
	{
		Scanner input=new Scanner(System.in);
		System.out.println("what is the magic number");
		double number=input.nextDouble();
		if(number==17)
		{
			System.out.println("You won a prize");
		}
	}
	
}