import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class slp
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int d=s.length();
		int count=0;
		for(int i=2;i<d;i++)
		{
			if(d%i==0)
			{
				count++;
			}
		}
		if(count==0)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}
}
