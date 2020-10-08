import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Authority
{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Inmate's name:");
        String iname=sc.nextLine();
        
        System.out.print("Inmate's father's name:");
        String fname=sc.nextLine();
        
        Pattern pattern=Pattern.compile("[a-zA-Z ]*");
        Matcher matcher=pattern.matcher(iname);
        Matcher matcher1=pattern.matcher(fname);
        
        if(matcher.matches() && matcher1.matches())
        {
            String iname1=iname.toUpperCase();
            String fname1=fname.toUpperCase();
            String sp=iname1.concat(" ");
            String fullName=sp.concat(fname1);
            System.out.print(fullName);
        }    
        
        else 
        System.out.println("Invalid name");
        
        
    }
}