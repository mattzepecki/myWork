package objectOrientation;

public class rightTriangle {
	private double height;
	private double base;

	public rightTriangle() {
		height = 7.0;
		base = 5.0;
	}

	public double getheight() {
		return height;
	}

	public void setheight(double xheight) {

		height = xheight;
	}

	public double getbase() {
		return base;
	}

	public void setbase(double xbase) {

		base = xbase;
	}
	public double hypotenuse() {
		double hypotenuse=Math.hypot(height, base);
		return hypotenuse;
	}
	public double perimeter() {
		double perim=height+base+hypotenuse;
		return perim;
	}

}
