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
	        sc.nextLine();
	        String s[]=new String[n];
	        for(int i=0;i<n;i++)
	        {
	            s[i]=sc.nextLine();
	        }
	        Map<String,Integer>map=new TreeMap<>();
	        for(int i=0;i<n;i++)
	        {
	            if(map.containsKey(s[i])==false)
	            {
	              map.put(s[i],1) ; 
	            }
	            else
	            {
	                map.put(s[i],map.get(s[i])+1);
	            }
	        }
	        for(Map.Entry<String,Integer>m1:map.entrySet())
	        {
	            System.out.println(m1.getKey()+" "+m1.getValue());
	        }
	    }
	}
}
