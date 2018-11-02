package objectOrientation;

public class testclassrectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rectangle bob=new rectangle();
		bob.setlength(15.0);
		System.out.println("The length is "+ bob.getlength());
		bob.setwidth(30.0);
		System.out.println("The width is " + bob.getwidth());
		double x = bob.perimeter();
		System.out.println("The perimeter is " + x);
		bob.changelength(23);
		System.out.println("The length is "+ bob.getlength());
		
		
	}

}
