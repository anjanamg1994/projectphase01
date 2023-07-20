//package self_learning_class;
//public interface Display{ 
//	
//	public int show(int a);
//}
//
//public class lambda_expression_class20 {
//
//	public static void main(String[] args) {
//		Display display = (int a) - > a;
//		System.out.println("return value from lambda expression = " + display.show(100));
///// writen as per the slide in class 
//	}
//
//}

package self_learning_class;
public interface aa { 
	
	public int show(int a);
}

public class lambda_expression_class20 {

	public static void main(String[] args) {
		aa statements = (int a) - > {
			return a;
		};
		System.out.println("return value from lambda expression = " + display.show(5));
/// writen as per the slide in class 
	}

}
