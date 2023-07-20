class Student{
	int rollnumber;
	String Student_name;
	
	Student(int reg_no, String name){
		this.rollnumber= reg_no;
		this.Student_name= name;
	}
	
}
public class Demo_class06 {

	public static void main(String[] args) {
		// declare an array of integer
		Student[] arr;
		
		arr = new Student[5];
		
		arr[0] = new Student(12341 , "Anjana");
		arr[1] = new Student(12342 , "Ajay");
		arr[2] = new Student(12343 , "Poppy");
		arr[3] = new Student(12344 , "Michu");
		arr[4] = new Student(12345 , "Jojo");
		
		for (int i=0; i < arr.length; i++)
			System.out.println(arr[i]);
		
		for (int i=0; i < arr.length; i++)
			System.out.println("Students with the Registration number " + arr[i].rollnumber + " is " + arr[i].Student_name);

	}

}
