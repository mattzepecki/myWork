package objectOrientation;

public class rectangle {
	private double length;
	private double width;

	public rectangle() {
		length = 7.0;
		width = 5.0;
	}

	public double getlength() {
		return length;
	}

	public void setlength(double xlength) {

		length = xlength;
	}

	public double getwidth() {
		return width;
	}

	public void setwidth(double xwidth) {
		width = xwidth;
	}

	public double perimeter() {
		double perimeter = length + length + width + width;
		return perimeter;
	}

	public double area() {
		double area = length * width;
		return area;
	}

	public void changelength(double newlength) {
		length = newlength;
	}

	public void changewidth(double newwidth) {
		width = newwidth;
	}

}
