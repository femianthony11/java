
import java.util.*;

public class prob {

 public static void main(String[] args) {

  Scanner stdin = new Scanner(System.in);
  System.out.println("Enter the height in feet from which you are dropping the ball.");
  int height = stdin.nextInt();
  int time = 0;

  System.out.println("Time\tHeight");


  while (height - 16*time*time > 0) {
   System.out.println(time+"\t\t"+(height-16*time*time));


   time = time+1;
  }


  System.out.println(time+"\t\t0");


 }
}