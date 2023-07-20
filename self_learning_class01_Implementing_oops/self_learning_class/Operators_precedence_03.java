package self_learning_class;
import java.util.Scanner;

public class Operators_precedence_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Widening data type exam = movinf from chara to int 
		char C = 'F'; /// ascii value of capital f is output
		int V= C;
		System.out.println(V);
		
	 //narrowing explicit in nature = int to chara 
		Scanner s= new Scanner (System.in);
		System.out.println("enter an integer value: ");
		int v;
		v = s.nextInt();
		char c = (char)v;
		System.out.println(" Charater value of the given integer : " + c);

	}

}
