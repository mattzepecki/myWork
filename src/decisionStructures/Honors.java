package decisionStructures;
import java.util.Scanner;
public class Honors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		double gpa=3.7;
		int grade=11;
		System.out.println("What is your gpa?");
		gpa=input.nextDouble();
		System.out.println("What grade are you in?");
		grade=input.nextInt();
		if(gpa>3.5&&grade==12)
		{
			System.out.println("congrats you are in the honor system");
		}
		else
		{
			System.out.println("U didnt make it");
		}
	}

}
