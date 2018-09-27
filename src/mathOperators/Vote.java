package mathOperators;
import java.util.Scanner;
public class Vote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=-999;
		Scanner input=new Scanner(System.in);
		System.out.println("What is your age");
		age= input.nextInt();
		age= 18- age;
		System.out.println("In " + age + " years you will be able to vote.");
	}

}
