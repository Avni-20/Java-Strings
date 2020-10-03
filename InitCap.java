import java.util.*;

public class InitCap
{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        
        String str= sc.nextLine();
        String upper="";
        
        Scanner linescan=new Scanner(str);
        while(linescan.hasNext())
        {
            String word=linescan.next();
            upper+=Character.toUpperCase(word.charAt(0))+word.substring(1)+" ";
        }
        
        if(upper.trim().equals(str))
        {
            System.out.println("First character of each word is already in uppercase");
        }
        
        else 
        {
            System.out.println(upper.trim());
        }
        
    }
}    
       
       