package self_learning_class;

public class Array_Class09 {
	
	static void minimum(int a[]) {
		int value = a[0];
		for (int m=1; m< a.length; m ++)// a.lenth = length of elements
			if (value >a[m])
			value = a[m];
		System.out.println(value);
				
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x[] = {93,3,9,2};
		minimum(x);
	}

}
