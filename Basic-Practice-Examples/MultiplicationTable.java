//program to print the multiplication table for the given number
 import java.util.Scanner;
 public class MultiplicationTable {

    public static void main(String[] args) {

        Scanner s =new Scanner(System.in);
		System.out.print("enter the number: " );
        int number =s.nextInt();
        for(int i = 1; i <= 10; ++i)
        {
			int multi= number*i;
            System.out.println(multi);
			
        }
    }
}