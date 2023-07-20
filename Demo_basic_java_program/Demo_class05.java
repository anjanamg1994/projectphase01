import java.util.Scanner;
public class Demo_class05 {
	

	public static void main(String[] args) {
		// declare the variable
		int n;
		
		// created the scanner obj
		Scanner sc = new Scanner(System.in);
		
		// running infinte loop
		while (true) {
			
		// display set of quiz option
		System.out.println("Who is the founder of blue origin?");
		System.out.println("1. Bill Gates\n2. Tin Cook\n3. Nadella\n4. Jeff Bezos\n5. exit");
		System.out.println("enter the correct value (1\2\3\4\5) ");
		
		n =sc.nextInt();
		if (n==4) {
			System.out.println("congrats");
			break;
		}
		else if (n==5) {
			break;
		}
		else {
			System.out.println("oops! try again ");
		}
		}
	}

}
