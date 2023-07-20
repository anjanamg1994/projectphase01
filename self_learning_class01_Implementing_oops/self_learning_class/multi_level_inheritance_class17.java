package self_learning_class;
class Parentclass {
	public void methodX() {
		System.out.println("parent class method is called";)
	}}
class childone extends parentclass {
	public void methodY() {
		System.out.println("class Y methodY");
	
	}}
class childtwo extends childone{
	public void methodZ() {
		System.out.println("Class Z method");
	}}

public class multi_level_inheritance_class17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		childtwo z =new childtwo();
		z.methodX();
		z.methody();
		z.methodz();

	}

}
