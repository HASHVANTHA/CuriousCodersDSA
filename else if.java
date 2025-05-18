import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the mark:");
		int mark = s.nextInt();
		if(mark >= 90)
		{
		    System.out.println("Grade A");
		} 
		else if(mark >= 80)
		{
		    System.out.println("Grade B");
		} 
		else if(mark >= 60)
		{
		    System.out.println("Grade C");
		}
		else if(mark >= 35)
		{
		    System.out.println("Grade D");
		} 
		else
		{
		    System.out.println("Fail");
		}
	}
}
