package self_learning_class;
abstract class subjects{
	// method of abstract class
	public void hello() {
		System.out.println("this is java programming");
	}
}
	
class Main extends subjects{

	public static void main(String[] args) {
		Main obj = new Main();
		// access method of abstract class
		//using objects of main class
		obj.hello();

	}

}
