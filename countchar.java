import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class countchar
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		char s1=sc.next().charAt(0);
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==s1)
			{
				count++;
			}
		}
		System.out.println(count);
	}
}
