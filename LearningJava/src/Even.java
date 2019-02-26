import java.util.Scanner;   // Scanner is a class in java.util package used for obtaining the input of the primitive types like int, double etc. and strings
						   // To create an object of Scanner class, we usually pass the predefined object System.in, which represents the standard input stream.
 
class Even {
   private static Scanner in;

public static void main(String args[])
   {
      int x;
      System.out.println("Enter an integer to check if it is odd or even");
      in = new Scanner(System.in);
      x = in.nextInt();
     
      if (x % 2 == 0)
         System.out.println("The number is even.");
      else
         System.out.println("The number is odd.");
   }
}

