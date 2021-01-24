
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	    int t;
	    Scanner sc=new Scanner(System.in);
	    t=sc.nextInt();
	    sc.nextLine();
	    while(t-->0)
	    {
	        int n=sc.nextInt();
	        String s[]=new String[n];
	        for(int i=0;i<n;i++)
	        {
	            s[i]=sc.next();
	        }
	        Map<String,Integer>m=new HashMap<>();
	        for(int i=0;i<n;i++)
	        {
	            if(m.containsKey(s[i])==false)
	            {
	                m.put(s[i],1);
	            }
	            else
	            {
	                m.put(s[i],m.get(s[i])+1);
	            }
	        }
	        int count=0;
	        for(Map.Entry<String,Integer>m1:m.entrySet())
	        {
	            if(m1.getValue()==2)
	            {
	                count++;
	            }
	        }
	        System.out.println(count);
	    }
		
	}
}
