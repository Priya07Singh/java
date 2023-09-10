import java.util.*;
public class xstar {

	public static void main(String args[])
	{		
		int i,j,n;
		Scanner sc = new Scanner(System.in);
    		System.out.println("Enter value of n");
    		n = sc.nextInt();
    
		for(i=n;i>=1;i--)
    		{
        		for(j=i;j<n;j++)
        		{
            			System.out.print(" ");
        		}
        		for(j=1;j<=(2*i-1);j++)
        		{
				if(j==1 || j==(2*i-1))
            				System.out.print("*");
				else
		        		System.out.print(" ");
        		}
        		System.out.println("");
    		}	
		for(i=2;i<=n;i++)
    		{
        		for(j=i;j<n;j++)
        		{
            			System.out.print(" ");
        		}
        		for(j=1;j<=(2*i-1);j++)
        		{
				if(j==1 || j==(2*i-1))
            				System.out.print("*");
				else
		        		System.out.print(" ");
        		}
        		System.out.println("");
    		}	
	}
	}


