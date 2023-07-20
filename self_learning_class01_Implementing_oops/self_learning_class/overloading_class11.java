package self_learning_class;

	class Sum {
		static int add(int x, int y) {
			return x+y;
		}
		static int add(int x, int y , int z) {
			return x+y+z;
		}
			
		
	    static double add(double  x, double  y , double z) {
		return x+y+z;
		
		}
	}
public class overloading_class11 {
	public static void main(String[] args) {
		System.out.println(Sum.add(10, 21));
		System.out.println(Sum.add(21, 11, 11));
		System.out.println(Sum.add(10.2,10.3,10.5));
		
		
	}

	}


