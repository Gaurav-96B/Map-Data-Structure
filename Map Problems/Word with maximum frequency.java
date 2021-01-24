
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void main(String args[])
    {
       int t;
       Scanner sc=new Scanner(System.in);
       t=sc.nextInt();
       sc.nextLine();
       while(t-->0)
       {
           Map<String,Integer>map=new LinkedHashMap<>();
           String s=sc.nextLine();
           String a[]=s.split(" ");
           int z=a.length;
           int i=0;
           while(i!=z)
           {
               if(map.containsKey(a[i])==false)
               {
                   map.put(a[i],1);
               }
               else
               {
                  int z0=map.get(a[i]);
                  int z1=z0+1;
                  map.put(a[i],z1);
               }
               i++;
          }
           int max=0;
           String value="";
           Set<Map.Entry<String,Integer>>hmap=map.entrySet();
           for(Map.Entry<String,Integer>data:hmap)
           {
               if(data.getValue()>max)
               {
             max=data.getValue();
             value=data.getKey();
               }
           }
           System.out.print(value+" ");
           System.out.println(max);
       }
}
}

	
