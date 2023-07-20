package self_learning_class;

import java.util.Scanner;

public class nested_if_statement_class05 {
	public static void main(String[] agrs ) {
		Scanner sc = new Scanner(System.in);
		int age;
		int weight;
		System.out.println("enter your age");
		age = sc.nextInt();
		System.out.println("enter your weight");
		weight = sc.nextInt();
		if (age >=18) {
		if (weight >50) {
			System.out.println("you are eligible");
		}
		}
		else {
			System.out.println("not eligible");
		}
	}

}
