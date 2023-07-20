package self_learning_class;

public class variable_arguments_class14 {
	class VarargsEx{
		static void display(String...values) { // ... it shows this is variable argument
		System.out.println("Display method has been invoked");
		}
	}

	public static void main(String args[]) {
		// TODO Auto-generated method stub
		// varaiable arguments data 
	display();
	display("my", "name", "is","JAVA");

	}

}
