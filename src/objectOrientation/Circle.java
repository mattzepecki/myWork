package objectOrientation;

public class Circle {
private double radius;
public Circle() {
	radius=5.0;
}
	public double getradius() {
			
	return radius;}

public void setradius(double xradius) {
	
	radius=xradius;	
}				
public void circumference() {
double circumference =radius*2*Math.PI;}

	
	
	
public void area() {
	double area =Math.PI*radius*radius;	
}


}
