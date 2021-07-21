/*TC=>O(mn)
SC=>O(1)*/
class Solution
{ 
    static int countPairs(int arr1[],int arr2[], int m, int n, int x) 
    { 
       int count=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(arr1[i]+arr2[j]==x)
                {
                    count++;
                }
            }
        }
        return count;
    }
}

/*TC=>O(M+N)
SC=>O(M)*/
class Solution
{ 
    static int countPairs(int arr1[],int arr2[], int M, int N, int x) 
    { 
        int count=0;
        Set<Integer>set=new HashSet<>();
        for(int i=0;i<M;i++)
        {
            set.add(arr1[i]);
        }
        for(int i=0;i<N;i++)
        {
            if(set.contains(x-arr2[i]))
            {
                count++;
            }
        }
        return count;
    }
}

/* TC=>O(M+N)
SC=>O(1)*/

class Solution
{ 
    static int countPairs(int arr1[],int arr2[], int m, int n, int x) 
    { 
        int l=0;
        int r=n-1;
        int count=0;
        while(l<m&&r>=0)
        {
            if(arr1[l]+arr2[r]==x)
            {
              count++;
              l++;
              r--;
            }
            else if(arr1[l]+arr2[r]<x)
            {
                l++;
            }
            else
            {
                r--;
            }
        }
        return count;
    }
}




