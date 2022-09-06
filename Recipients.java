import java.util.*;

import javax.swing.plaf.TreeUI;

public class Recipients {
    private List<String> lines;
    /*
    */
    public Recipients(){
        lines = new ArrayList<String>();
        lines.add("Mr. J Adams");
        lines.add("6 Rose St.");
        lines.add("Ithaca, NY 14850");
        lines.add(" ");
        lines.add("Jack S. Smith");
        lines.add("12 Posy Way");
        lines.add("Suite 201");
        lines.add("Glendale, CA 91203");
        lines.add(" ");
        lines.add("Ms. M.K. Delgado");
        lines.add("2 River Dr.");
        lines.add("New York, NY 10013");
        lines.add(" ");
    }
    /*
    A
    */
    public String extractCity(String cityZip)
    {
        int cindex = cityZip.indexOf(",");
        return cityZip.substring(0, cindex);
    }
    /*
    B
    */
    public void printNames()
    
    {
        /*Prints First Name in Lines*/
        System.out.println(lines.get(0)); 
        /*Creates Boolean Flag */
        boolean flag = false;
        /*For loop created to iterate through list lines*/
        for (int i = 0; i < lines.size(); i++){
            /* Checks if lines at index is empty */
            if (lines.get(i).equals(" "))
            {
                /* If line is empty,sets bool flag to true and continues */
                flag = true;
                continue;
            }
            /* If the flag is true */
            if (flag == true)
             {
                /*Print lines at index and sets flag to false to avoid printing every line */
                System.out.println(lines.get(i));
                flag = false;
             }
        }
    }



public static void main(String[] args) {
        Recipients rec = new Recipients();
        //String cityZip = "Ithaca, NY 14850";
        //System.out.println(rec.extractCity(cityZip));
        //rec.printNames();
        String address = (rec.getAddress("Jack S. Smith"));
        System.out.println(address);
        
        
}

public String getAddress(String name)
{
    /* Creating Boolean Flag */
    boolean flag = false;
    /* Creating Address String */
    String address = "";
    /*For loop to iterate through the lines */
    for (int i = 0; i < lines.size(); i++){
        /*Lines.get variable to clean up code */
        String curline = lines.get(i);
        /*If the current line loop is on equals the name passed */
        if (curline.equals(name))
         {
            /* Change bool flag to true and continue to show the target has been found */
            flag = true;
            continue;
         }
         /* If the bool flag is true, */
        if (flag == true)
        {
            /*If current line loop is on is NOT empty, */
            if(!(curline.equals(" ")))
            {
                /*Add current line's contents to address variable */
                address = address+"\n" + curline;
                //System.out.println(address);
                
            }
            /*If the current line IS empty, break */
            else
            {
                break;
            }
            
        }

    }
    /*return address variable */
    return address;
}
}