package decisionStructures;
import java.util.Scanner;
public class luckyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		double adultHeight=434;
		double kidWeight=343;
		int age=355;
		double number=3434;
		double number2=4543;
		System.out.println("How old are you?");
		age=input.nextInt();
		if(age>=18)
		{
			System.out.println("WHat is your height");
			adultHeight=input.nextDouble();
			number=adultHeight*5;
			System.out.println("luckynumber=" + number);
		}
		else
		{
			System.out.println("WHat is your weight");
			kidWeight=input.nextDouble();
			number2=kidWeight*3;
			System.out.println("luckynumber=" + number2);
		}
	}

}
