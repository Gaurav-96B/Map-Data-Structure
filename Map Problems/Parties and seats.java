class Geeks
{
    public static void Election2019(String party[], int seats[], int n)
    {
        int max=0;
          Map<String,Integer>map=new TreeMap();
          int i=0;
          while(i!=n)
          {
              map.put(party[i],seats[i]);
              i++;
          }
          for(Map.Entry<String,Integer>data:map.entrySet())
          {
              if(data.getValue()>max)
              {
                  max=data.getValue();
              }
              System.out.print(data.getKey()+" ");
              System.out.println(data.getValue());
          }
          System.out.println(max); 
    }
}
