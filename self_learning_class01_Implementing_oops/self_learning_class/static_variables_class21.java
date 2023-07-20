package self_learning_class;
public class Temp{
	private double temp;
	public static double maxT = 0;
	public Temp(double t) {
		temp =t;
		if(t > maxT)
			maxT=t;
	}

public class static_variables_class21 {

	public static void main(String[] args) {
		Temp t1 = new Temp(55);
		Temp t2 = new Temp(100);
		Temp t3 = new Temp(85);
		System.out.println("max Temp: " + Temp.maxT);
	

	}

}}
