import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size:");
		int size = s.nextInt();
		switch(size)
		{
		    case 29:
		        System.out.println("small");
		        break;
		    case 30:
		        System.out.println("Medium");
		        break;
		    case 38:
		        System.out.println("Large");
		        break;
		    case 42:
		        System.out.println("XLarge");
		        break;
		    default:
		        System.out.println("Invalid");
		        break;
		}
	}
}
