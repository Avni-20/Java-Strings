import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
public class Palindrome
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Pattern pattern=Pattern.compile("[a-zA-Z0-9]*");
        
        System.out.println("Enter the word : ");
        String str=sc.nextLine();
        String word=str.toLowerCase();
       
        Matcher matcher=pattern.matcher(word);
        
        if(matcher.matches())
        
         {   
             String reverse="";
            
            for(int i=word.length()-1;i>=0;i--)
            {
                reverse+=word.charAt(i);
            }
            
           
            if(reverse.equals(word))
            System.out.println(word+" is a Palindrome");
            
            else 
            System.out.println(word+" is not a Palindrome");
         }    
         
         else if(!matcher.matches()) 
         System.out.println("Invalid Input");
        
    }
    
}