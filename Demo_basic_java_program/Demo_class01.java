
import java.util.Scanner;

class Demo_class01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//System.out.println("hello World !");
			int x,y;
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the value of x : ");
			System.out.println("enter the value of y : ");
			x = sc.nextInt();
			y = sc.nextInt();
			System.out.println("Arthimetic operations of two numbers are : ");
			System.out.println("Addition of the numbers : " + x + y ); /// here it does concatentation of strings
			System.out.println("Addition of the numbers : " + (x + y ));
			System.out.println("Subtraction of the number : " + (x - y));
			System.out.println("multiplication of the number : " + (x*y));
			System.out.println("Division of the number : " + (x/y));
			System.out.println("percentage of the number : " + (x%y));
			int num1 =20, num2 =10;
			System.out.println("Arthimetic operations of two numbers are : ");
			System.out.println("Addition of the numbers : " + num1 + num2 ); /// here it does concatentation of strings
			System.out.println("Addition of the numbers : " + (num1 + num2 ));
			System.out.println("Subtraction of the number : " + (num1 - num2));
			System.out.println("multiplication of the number : " + (num1*num2));
			System.out.println("Division of the number : " + (num1/num2));
			System.out.println("percentage of the number : " + (num1%num2));


	}

}
