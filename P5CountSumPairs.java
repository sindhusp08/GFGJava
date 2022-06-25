public class P5CountSumPairs
{
    //sort the array and apply below logic O(Nlog(n))
    public static int sumPairs(int sum,int arr[])
    {
        int count=0;
        int n=arr.length;
        int i=0;
        int j=n-1;
        while(i<j)
        {
            if(arr[i]+arr[j] ==sum)
            {
                count++;
                i++;
                j--;

            }
            else if(arr[i]+arr[j] < sum)
            {
                i++;
            }
            else
            {
                i--;
            }
        }
        return count==0 ? -1 : count;
    }
    public static void main(String[] args) {
        int arr[]={0,0,2,7,9};
        int r=P5CountSumPairs.sumPairs(9,arr);
        System.out.println(r) ;
        
    }
}