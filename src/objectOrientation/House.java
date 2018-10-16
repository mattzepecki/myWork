package objectOrientation;

import java.util.Scanner;
public class House {
	
	
	{
	

Scanner input= new Scanner(System.in);
double length=-999.0;
double width=-999.0;
double depth=-999.0;
double cubicSand=-999.0;
System.out.println("What is the length of the sandbox");
length=input.nextDouble();
System.out.println("What is the width of the sandbox");
width=input.nextDouble();
System.out.println("What is the depth of the sandbox");
depth=input.nextDouble();
System.out.println("How much cubic sand can you move each hour");
cubicSand=input.nextDouble();

double value=length*width*depth/cubicSand;
input.close();

}
}