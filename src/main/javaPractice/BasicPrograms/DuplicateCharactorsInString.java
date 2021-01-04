package BasicPrograms;

public class DuplicateCharactorsInString {

	public static void main(String[] args) {
		
		// By converting String to Charactor Array//
		String str = "Yashwanth";
	      char[] charArray = str.toCharArray();
	      System.out.println("The string is:" + str);
	      System.out.print("Duplicate Characters in above string are: ");
	      for (int i = 0; i < str.length(); i++) {
	         for (int j = i + 1; j < str.length(); j++) {
	            if (charArray[i] == charArray[j]) {
	               System.out.print(charArray[j] + " ");
	               break;
	            }
	         }
	      }
	}

}
