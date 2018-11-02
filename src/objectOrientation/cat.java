package objectOrientation;

public class cat {
	private double age;
	private double sleep;

	public cat() {
		age = 7.0;
		sleep = 5.0;
	}

	public double getage() {
		return age;
	}
	public void setage(double xage) {

		age = xage;
	}

	public double getsleep() {
		return sleep;
	}
	public void setsleep(double xsleep) {

		sleep = xsleep;
	}
	public void changeage(double newage) {
		age = newage+1;
		} 
	
}
