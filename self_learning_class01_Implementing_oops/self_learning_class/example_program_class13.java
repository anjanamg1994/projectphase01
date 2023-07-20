package self_learning_class;

public class example_program_class13 {
	int v =500;
	void change(int v) {
	v =v +100;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//operation 
		example_program_class13 o = new example_program_class13();
		System.out.println("Before making change "+o.v);
		o.change(500);
		System.out.println("After change mode " + o.v);
		

	}

}
