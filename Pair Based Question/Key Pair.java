/*TC=>O(n*n)
SC=>O(1)*/
class Solution {
    boolean hasArrayTwoCandidates(int arr[], int n, int x) {
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]+arr[j]==x)
                {
                    return true;
                }
            }
        }
        return false;
    }
}

/*TC=>O(n)
SC=>O(n)*/
class Solution {
    boolean hasArrayTwoCandidates(int arr[], int n, int x) {
        Map<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            if(map.containsKey(x-arr[i])==true)
            {
                return true;
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
        return false;
    }
}
