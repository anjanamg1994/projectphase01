
public class Demo_class04 {

	public static void main(String[] args) {
		// initializing string with some string value 
		String string_var1="string function program";
		String string_var2="string function";
		
		// commonly used string function
		System.out.println("String operations are: ");
		
		// getting character in specific position 
		System.out.println(string_var1.charAt(2));
		
		//getting unicode character at specific index
		System.out.println(string_var1.codePointAt(3));
		
		// getting unicode characterbefore the specific index
		System.out.println(string_var1.codePointBefore(1));
		
		//counting number of unicode character between the indexes given
		System.out.println(string_var1.codePointCount(0, 5));
		
		//compare two string lexicongraphycally i.e., based on unicode value
		System.out.println("\nstring comparison function");
		
		System.out.println(string_var1.compareTo(string_var2));
		
		
		//compare two string lexicongraphically ignoring the case 
		System.out.println(string_var1.compareToIgnoreCase(string_var2));
		
		//append a string with another
		System.out.println("\nconcatentaed the string");
		System.out.println(string_var1.concat(string_var2));
		
		// check whether the string contains another string
		System.out.println(string_var1.contains(string_var2));
		
		//check whether the string ends with specific character
		System.out.println(string_var1.endsWith("gram"));
		
		// compare and return true with the strings are equal
		System.out.println(string_var1.equals(string_var2));
		
		//compare and return true if the strings are equal ignoring the case
		System.out.println(string_var1.equalsIgnoreCase(string_var2));
		
		//hash code for a string is compared like this
		//s[0]*31^(n-1) + s[1]*31^(n-2) ...........+ s[n-1]
		System.out.println(string_var1.hashCode());
		
		//get the position of the first occurance of specific character
		System.out.println(string_var1.indexOf("program"));
		
		//verifiy if the strings are equal
		String string_var3 = "demo";
		System.out.println(string_var3.isEmpty());
		
		//get the position of the last occurence of the specific character
		string_var3 = "Functins program Functions";
		System.out.println("\n last Occurence of the position");
		System.out.println(string_var3.lastIndexOf("Functions"));
		
		//get string length
		System.out.println(string_var3.length());
		
		//search string with specific vale and replace the same 
		System.out.println(string_var3.replace("Functions", "java"));
		System.out.println(string_var3);
		
		// verific if strings starts with given string
		System.out.println(string_var1.startsWith("String"));
		
		//convvert the string to lower case 
		String string_var4 ="HELLLO WORLD !";
		System.out.println(string_var4.toLowerCase());
		
		// covert the string to upper case 
		String string_var5 = "      i am anjana m g ";
		System.out.println(string_var5.toUpperCase());
		
		// to trims space btween and all the string 
		System.out.println(string_var5.trim());
		
		

	}

}
