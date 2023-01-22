import java.util.Scanner;

public class RectArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter length: ");
		double length=sc.nextDouble();
		System.out.println("Enter breadth: ");
		double breadth=sc.nextDouble();
		
		double area= length*breadth;
		
		System.out.println("Area of Rectangle: " + area);
		
		
		
	}

}
