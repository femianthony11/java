// BiggerOne.java

import java.util.Scanner; // importing Scanner class

public class BiggerOne
{
  public static void main( String[] args )
  {
    Scanner s = new Scanner( System.in ); // object reference
      
    int num1; // 1st number from user
    int num2; // 2nd number from user
    
    System.out.println( "Enter 1st number: " ); // prompt
    num1 = s.nextInt();
    
    System.out.println( "Enter 2nd number: " ); // prompt
    num2 = s.nextInt();
    
    System.out.println( "The Bigger Number is: " + findBigger( num1, num2 ) ); // calling the findBigger method with num1 and num2 as integer arguments for the paramter
  }
  private static int findBigger( int n1, int n2 ) // static --> can be called within class and parameters --> to evaluate which is bigger and returning int
  {
    if ( n1 > n2 ) // 1st is bigger than second
    {
      return n1; // using return keyword
    }
    else if ( n2 > n1 ) // 2nd is bigger than 1st
    {
      return n2; // returning 2nd number which is bigger
    }
    else
    {
      return n1; // returning 1st number when both are equal
    }
  }
}

// apcs.tv