import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class pro57
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String k=sc.next();
		int count=0;
		for(int i=0;i<s.length()-1;i++)
		{
			for(int j=0;j<k.length()-1;j++)
			{
				if(s.charAt(i)==k.charAt(j)&&s.charAt(i+1)==k.charAt(j+1))
				{
					count++;
				}
			}
		}
		if(count>0)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}
}
