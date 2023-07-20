package self_learning_class;

class planet{
	//overridden method
	public void earth() {
		System.out.println("earth is a planet ");
	
	}}
class pluto extends planet{
	//overriding method
	public void earth() {
	System.out.println("pluto is also a planet");
}}

public class overriding_method_class19 {

	public static void main(String[] args) {
		pluto obj = new pluto();
		obj.earth();

	}

}
