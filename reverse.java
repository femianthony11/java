import java.util.*;

public class reverse {

 public static void main(String[] args) {

  Scanner stdin = new Scanner(System.in);
  System.out.println("Enter n.");
  int n = stdin.nextInt();

  // Peel off each digit, one by one, printing from the back to the front.
  while (n > 0) {
   System.out.print((n%10));
   n = n/10;
  }
  System.out.println();
 }
}