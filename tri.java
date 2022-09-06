import java.util.*;

public class tri {


 public static void main(String[] args) {

  Scanner stdin = new Scanner(System.in);
  System.out.println("Enter n.");
  int n = stdin.nextInt();

  // Label rows from n down to 1.
  for (int i=n; i>=1; i--) {

   // Print 1, 2, 3, ..., i
   for (int j=1; j<=i; j++)
    System.out.print(j+" ");

   System.out.println();
  }


  // I will count my rows from 0 to n-1.
  for (int i=0; i<n; i++) {

   for (int j=1; j<=n-i; j++)
    System.out.print(j+" ");
   System.out.println();
  }
 }
}