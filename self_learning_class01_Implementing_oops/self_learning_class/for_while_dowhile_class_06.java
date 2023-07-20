package self_learning_class;
import java.util.Scanner;
public class for_while_dowhile_class_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// for loop
		labe10: for (int a=1; a<=3; a++) {
		lable1: for (int b =1; b<=3; b++) {
			if (a==2 &&b ==2) {
			break lable1;
			}
			System.out.println(a+ "" +b);
		}
		}
// while loop
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of value");
		i= sc.nextInt();
		while (i<=5) {
			System.out.println(i);
			i++;
		}
		
		// do loop
		int s;
		Scanner sa =new Scanner(System.in);
		System.out.println("enter the first no");
		s =sa.nextInt();
		do {
		System.out.println(s);
		s++;
		} while (s<=5);
	}
		
	
}
