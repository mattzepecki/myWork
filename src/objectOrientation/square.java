package objectOrientation;

public class square {
private double side;
public square() {
	side=12;
}
public square(double newside) {
	if(side>0)
	side=newside;
	else
		side=10;
}
public double area() {
	return side*side;
}
}  