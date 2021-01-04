package BasicPrograms;

public class CharToStringandStringToChar {

	public static void main(String[] args) {
		
		
		
		// Method 1: Using toString() method
	      char ch = 'a';
	      String str = Character.toString(ch);
	      System.out.println("String is: "+str);
	 
	      // Method 2: Using valueOf() method
	      String str2 = String.valueOf(ch);
	      System.out.println("String is: "+str2);
	      
	      ///String to Charactor////
	      
	      System.out.println("Given input String is 'Yashwanth' ");
	      
	      String str3 = "Yashwanth";
	      int stringlength = str3.length();
	      System.out.println("Given String lenth is " + stringlength) ;
	      
	      for(int i =0;i<stringlength ;i++) {
	    	  char ch1 = str3.charAt(i);
	    	  System.out.println("Generated Charactor is " + ch1);
	      }
	      

	}

}
