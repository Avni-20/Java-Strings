import java.util.*;

public class Login
{
    private String userName;
    private String password;
    
    public Login(String userName,String password)
    {
        this.userName=userName;
        this.password=password;
    }
    
    public String getUserName()
    {
        return this.userName;
    }
    
    public String getPassword()
    {
        return this.password;
    }
    
    public void setUserName(String userName)
    {
        this.userName=userName;
    }
    
    public void setPassword(String password)
    {
        this.password=password;
    }
    
    public boolean validate()
    {
        boolean flag=false;
        if(getUserName().equalsIgnoreCase("john") && getPassword().equalsIgnoreCase("123abc"))
        {
           
            flag=true;
        }    
        
        else 
        {
            
            flag=false;
        }
        
        return flag;
    }
    
    
    
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
      
        
        System.out.println("Enter the username:");
        String username=sc.next();
      
        
        
        System.out.println("Enter the password:");
        String password=sc.next();
      
        Login obj=new Login(username,password);
        boolean value= obj.validate();
        
        if(value)
        System.out.println("Valid User");
        else 
        System.out.println("Invalid User");
    }
}    
