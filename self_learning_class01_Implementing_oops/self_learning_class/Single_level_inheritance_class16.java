package self_learning_class;

class parentclass{
	//Declare an instance method.
	public void methodA() {
		System.out.println("Parent class method is called ");
		
	}}
//declare a derrvied class or subclass and extend class A.
class childclass extend parentclass{
	public void methodB() {
		System.out.println("child class method is called";)
	}}

public class Single_level_inheritance_class16 {

	public static void main(String[] args) {
		childclass obj= new childclass();
		obj.methodA(); //methodA() of B will be called because by default, it is avaliable in B
		obj.methodB();//methodB() of B will be called
	}

}
