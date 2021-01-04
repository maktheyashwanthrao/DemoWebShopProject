package BasicPrograms;

public class ReverseString {

	public static void main(String[] args) {

		String str = "Yashwanth";
		System.out.println("The string is:" + str);
		String revstr = " ";
		int strlength = str.length();
		for (int i = strlength - 1; i > 0; i--) {
			 revstr = revstr + str.charAt(i);
			
		}
		
System.out.println("Reversed String is " + 			 revstr);
	}
}
