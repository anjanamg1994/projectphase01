package self_learning_class;

public class Operators_rest_02 {

	public static void main(String[] args) {
		// logical operators a>b , a>c = &&AND, ||OR, !NOT
		int m1= 10, m2=5, m3=20;
		System.out.println(m1<m2 && m1++ <m3);
		System.out.println(m1);
		System.out.println(m1 <m2 & m1++<m3);
		System.out.println(m1);
		//ternary operators - three operands
		int m = 200 , n=500;
		int min;
		min = (m<n)?m:n;
		System.out.println(min);
		// assignment opratos = assign rifht hand side value to the left hand side
		
		int n1= 30, n2=40;
		n1 +=4;
		n2 -=4;
		System.out.println(n1);
		System.out.println(n2);

	}

}
