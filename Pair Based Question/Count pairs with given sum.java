/*TC=>O(n*n)
SC=>O(1)*/
class Solution {
    int getPairsCount(int[] arr, int n, int k) {
        int count=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]+arr[j]==k)
                {
                    count++;
                }
            }
        }
        return count;
    }
}

/* TC=>O(n)
SC=>O(n)*/
class Solution {
    int getPairsCount(int[] arr, int n, int k) {
        Map<Integer,Integer>map=new HashMap<>();
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(map.containsKey(k-arr[i])==true)
            {
                count=count+map.get(k-arr[i]);
            }
            if(map.containsKey(arr[i])==false)
            {
                map.put(arr[i],1);
            }
            else
            {
                map.put(arr[i],map.get(arr[i])+1);
            }
        }
        return count; 
    }
}
