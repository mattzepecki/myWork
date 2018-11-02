package decisionStructures;
import java.util.Scanner;
public class testScores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
System.out.println("What was your first test score?");
double test1=input.nextDouble();
System.out.println("What was your second test score?");
double test2=input.nextDouble();
System.out.println("What was your third test score?");
double test3=input.nextDouble();
System.out.println("Three test scores are:" + test1+ test2+ test3);
double average=test1+test2+test3/3;
if (average>=92.5) {
	System.out.println("you go a A");
}
	if(average>=84.5&&average<92.5) {
		System.out.println("you got a B");
	}
		if (average>=77.5&&average<84.5) {
			System.out.println("you got a C");
		}
			if (average>=69.5&&average<77.5) {
				System.out.println("You got a D");
			}
				if(average<=69.4)
					System.out.println("You got a F you suck");
	}
			

	
	}


