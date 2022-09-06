// Polygon.java

public class Polygon
{
  private int numSides;
  
  public Polygon()
  {
    numSides = 1;
  }
  
  public Polygon( int n )
  {
    numSides = n;
  }
  
  public int getNumSides()
  {
    return numSides;
  }
  
  public void setNumSides( int n )
  {
    numSides = n;
  }
  
  public String toString()
  {
    return "Number of Sides: " + numSides;
  }
}