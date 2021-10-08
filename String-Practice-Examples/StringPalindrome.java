//write the program to find whether the given string is palindrome or not
import java.util.Scanner;
             
public class StringPalindrome {
   public static void main(String args[]){
	   Scanner s =new Scanner(System.in);
		System.out.print("enter the string: ");
        String word =s.nextLine();

     
      StringBuffer sb1 = new StringBuffer (word);
      sb1.reverse();
      StringBuffer sb2 = new StringBuffer(sb1.toString());
      System.out.println(sb2);
      String data =sb2.toString();
	  if(word.equals(data)){
      
         System.out.println("Given String is palindrome");
      }else{
         System.out.println("Given String is not palindrome");
      }
   }
}
