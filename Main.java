import java.util.Scanner;

class Main {
  public static void main(String[] args) {
//-------------------------------------------------------
    // Ignore scanner
    Scanner sc = new Scanner(System.in);

    // You will use these two strings.
    String mystery = sc.next();
    String mystery2 = sc.next();
    
    // Ignore
    sc.close();
//--------------------------------------------------------
    // 1. Print the length of String mystery
		   System.out.println(mystery.length());

 

    // 2. Print the character at the 5th position in the String mystery.
	 System.out.println(mystery.charAt(4));

   

    // 3. Combine mystery and mystery2 and print the resulting string.
     System.out.println( mystery + " and " + mystery2);

  

  

  }
}