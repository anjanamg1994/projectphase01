
import java.util.Scanner;
public class Demo_class03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// display content - factorial of a number 
		///3!= 1*2*3 = 6
		
		// declaring variable
		int x;
		int fact_var =1;
		
		// creating scanner class 
		Scanner sc = new Scanner(System.in);
		
		//User input
		System.out.println("enter the value?");
		x= sc.nextInt();
		
		//Calculating factorial
		int i =1;
		while (i <=x) {
			fact_var *=i;
			i++;// i = i+1
			
		}
		//display output
		System.out.println("factorial of the number : "+ x +" is " +fact_var);
		
		

	}

}
