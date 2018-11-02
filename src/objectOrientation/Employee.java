package objectOrientation;

public class Employee {
private double Wage;
public Employee() {

Wage = 7.50;
}
	public double getWage()
	{
		return Wage;
	}
			public void setWage(double xWage)
			{
				Wage=xWage;
			}
			public double raise(){
				Wage= Wage *1.1;
				return Wage;
						
			}
		


}
