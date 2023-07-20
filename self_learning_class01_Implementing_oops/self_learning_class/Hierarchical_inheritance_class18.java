package self_learning_class;
class parent{
	public void msgA() {
		System.out.println("method of class a");
		
	}
}
class child extends parent{
	// empty class b inherits msgA of parent class A
}
class child2 extends parent{
	//empty class c, inherits msgAof parent class A
}
class child3 extends parent{
	//empty class d, inherits msgAof parent class A.
}

public class Hierarchical_inheritance_class18 {

	public static void main(String[] args) {
	// create the obj of class B, C and D
		child obj1 = new child();
		child obj2 = new child2();
		child obj3 = new child3();
		// calling inherited functions from the base class
		obj1.msgA();
		obj2.msgA();
		obj3.msgA();

	}

}
