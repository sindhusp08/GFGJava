public class P3MissingArray
{
    // program to find sequential number in missing array 
    public static int missingArray(int arr[])
    {
        int n=arr.length;
        int totalSum=n*(n+1)/2;
        int arraySum=0;
        for(int i=0;i<n;i++)
        {
            arraySum=arraySum+arr[i];
        }
        return totalSum -arraySum;

    }
    public static void main(String[] args) {
        int arr[]={0,1,2,3,5,6,4};
        int r=P3MissingArray.missingArray(arr);
        System.out.println(r);

    }
}