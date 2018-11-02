package objectOrientation;

public class testclassCat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cat fred=new cat ();
		fred.setage(5.0);
		System.out.println("The age of the cat is " + fred.getage());
		fred.setsleep(6.0);
		System.out.println("The amount of sleep my cat gets is " + fred.getsleep());
		fred.changeage(5.0);
		System.out.println("The new age is "+ fred.getage());
		
	}

}
