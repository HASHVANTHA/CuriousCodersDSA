import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner s=new Scanner(System.in);
	    long n=s.nextLong();
		int count=0;
		while(n>0){
		    count=count+1;
		    n=n/10;
		}
        System.out.println(count);
	}
}
