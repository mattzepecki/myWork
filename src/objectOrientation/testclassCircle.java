package objectOrientation;

public class testclassCircle {

	public static void main(String[] args) {
		// TODO Auto-generaed method stub
Circle matt=new Circle();

System.out.println("The radius is " +  matt.getradius());
matt.setradius(7.0);
System.out.println("The new radius is " + matt.getradius());

		matt.circumference();
		matt.area();
		

}
}