import java.util.*;

import javax.swing.plaf.TreeUI;

public class Wordset {
    List<String> ws;
    public Wordset(){
        ws = new ArrayList<String>();
    }
    public int size(){
        int size = ws.size();
        return size;
    }
    public void insert(String word){
        for (int i = 0; i < ws.size(); i++){
            if (word == ws.get(i)){
                break;
            }
        }
        ws.add(word);
    }
    public void remove(String word){
        for (int i = 0; i < ws.size(); i++){
            if (!(word == ws.get(i))){
                continue;
            }
            else
            {
                ws.remove(i);
            }
        }
    }
    public String toString() {
        String output = "";
        for (int i = 0; i < ws.size(); i++){
            output = output +" " +ws.get(i);
            
        }
        return output;
    }
    public String findkth(int k){
        String win = ws.get(k);
        return win;
    }
    public boolean contains(String word){
        for (int i = 0; i < ws.size(); i++)
        {
            if (ws.get(i) == word)
            {
                return true;
            }
        }
        return false;
    }

/*    public static void main(String[] args)
    {
        Wordset w = new Wordset();
        w.insert("APPLE");
        w.insert("FIG");
        w.insert("GRAPE");
        w.insert("PEAR");
        w.insert("AVOCADO");
        int c = countA(c);
        System.out.println(c);
    }
    public static int countA(Wordset ws)
    {
        int c = 0;
        for (int i = 0; i < ws.size(); i++)
        {
            if (ws.findkth(i).substring(0) == "A")
            {
                c++;
            }
        }

        return c;
    } */  


public static void main(String[] args)
{
    Wordset w = new Wordset();
    w.insert("APPLE");
    w.insert("FIG");
    w.insert("GRAPE");
    w.insert("APRICOT");
    w.insert("PEAR");
    w.insert("AVOCADO");
    //int c = countA(w);
    //System.out.println(c);
    removeA(w);
    System.out.println(w);
    Wordset s1 = new Wordset();
    Wordset s2 = new Wordset();
    s1.insert("BE");
    s1.insert("NOT");
    s1.insert("AFRAID");
    
    s2.insert("BE");
    s2.insert("TO");
    s2.insert("OR");
    s2.insert("NOT");    
    Wordset p = commonElements(s1, s2);
    System.out.println(p);
}
public static int countA(Wordset ws)
{
    int c = 0;
    for (int i = 0; i < ws.size(); i++)
    {
        String ch = ws.findkth(i).substring(0,1);
        if (ch.equals("A"))
        {
            c++;
        }
    }

    return c;
}   
public static void removeA(Wordset ws)
{
    
    for (int i = 0; i < ws.size(); i++)
    {
        String ch = ws.findkth(i).substring(0,1);
        if (ch.equals("A"))
        {
            String wd = ws.findkth(i);
            ws.remove(wd);
        }
    }
    
}
public static Wordset commonElements(Wordset s1,Wordset s2) {
    Wordset n = new Wordset();
    for (int i = 0; i < s1.size(); i++) {
        String b = s1.findkth(i);
        if (s2.contains(b)){
            n.insert(b);
        }

    }
    return n;
}
}