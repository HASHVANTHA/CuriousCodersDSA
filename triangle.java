import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the angle 1:");
		int a = s.nextInt();
		System.out.println("Enter the angle 2:");
		int b = s.nextInt();
		System.out.println("Enter the angle 3:");
		int c = s.nextInt();
		if(a+b+c == 180)
		{
		    System.out.println("Triangle can be formed");
		}
		else
		{
		    System.out.println("Triangle cannot be formed");
		}

	}
}
