package objectOrientation;

public class car {
	private double mPG;
	private double fuelCapacity;
	private double fuel;
	private double odometer;
	car() {
	    mPG = 20;
	    fuelCapacity = 20;
	    fuel = 20;
	    odometer=0;
	    }
	 public car(double newmPG, int newfuelCapacity, double newfuel, double newodometer) {
		    mPG=newmPG;
		    fuelCapacity=newfuelCapacity;
		    fuel= newfuel;
		    odometer= newodometer;	    
	}
public double getmPG() {
	return mPG;
}
public double getfuelCapacity() {
	return fuelCapacity;
}
public double getfuel() {
	return fuel;
}
public double getodometer() {
	return odometer;
}

}






