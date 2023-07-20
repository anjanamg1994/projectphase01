package Implement_OOPS_using_java;
import java.util.Scanner;
public class Class_02_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double PI= 3.14;
		Scanner Scr=new Scanner(System.in);
		System.out.println("Enter Radius of circle?");
		float radius = Scr.nextFloat();

		System.out.println("Area of cicle is " + (PI *radius *radius));
	}

}
