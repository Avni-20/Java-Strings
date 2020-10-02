/*Program to print word in descending order without duplicates*/
import java.util.*;

public class printDescending {

	public static void main(String[] args) {
		System.out.println("Enter Word: ");
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		StringBuilder sb=new StringBuilder();
		
		char[] c=str.toCharArray();
		Arrays.sort(c);
		
		for(int i=0;i<c.length;i++)
		{
			boolean flag=false;
			for(int j=i+1;j<c.length;j++)
			{
				if(c[i]==c[j])
				{
					flag=true;
					break;
				}
				
				
			}
			
			if(!flag)
			sb.append(c[i]);
		}
	
		System.out.println(sb);

	
	}
}
