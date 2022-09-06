// DayName.java

import java.util.Scanner; // importing Scanner class

public class DayName 
{
  public static void main( String[] args )
  {
    Scanner s = new Scanner( System.in );
    int dayNum;
    
    System.out.println( "Enter the number of the day in a week (1-7): " );
    dayNum = s.nextInt();
    
    String result = getName( dayNum ); // setting string to String value returned by the getName method
    System.out.println( result ); // printing string
  }
  private static String getName( int dayNumber ) // method declaration, returning String, static so called within class, int dayNumber --> parameter
  {
    if ( dayNumber == 1 ) // value of 1
    {
      return "Sunday"; // day 1 is Sunday
    }
    else if ( dayNumber == 2 ) // value of 2
    {
      return "Monday";
    }
    else if ( dayNumber == 3 ) // value of 3
    {
      return "Tuesday";
    }
    else if ( dayNumber == 4 ) // value of 4
    {
      return "Wednesday";
    }
    else if ( dayNumber == 5 ) // value of 5
    {
      return "Thursday";
    }
    else if ( dayNumber == 6 ) // value of 6
    {
      return "Friday";
    }
    else if ( dayNumber == 7 ) // value of 7
    {
      return "Saturday";
    }
    else // not from 1 to 7
    {
      return "Not a Valid Day Number!";
    }
  }
}

// apcs.tv
