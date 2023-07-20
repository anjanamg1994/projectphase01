package self_learning_class;
import java.util.Scanner;

public class ConditionalStstement_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// IF Statment 
		int years = 60;
	if (years >18) {
	System.out.println("Your age is greater than 18");
	}
	
// if else
	System.out.println("enter the vale ?");
	Scanner val = new Scanner (System.in);
	int num = val.nextInt();
	
	if (num %2 == 0) {
		System.out.println("even number");
	}
	else {
		System.out.println("the number is odd");
	}
// else if statement for multiple
	
	int number = 155;
	if (number >0) {
	System.out.println("positive");
	} else if (number <0) {
	System.out.println("negative");
	}else {
		System.out.println("Zero");
		
	}

	}

}


