import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class print
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);	
		String s=sc.nextLine();
		for(int i=0;i<s.length();i++)
		{	
			System.out.print(s.charAt(i)+" "+" ");
		}
	}
}
