public class P6PivotIndex {
    public static int pivotIndex(int arr[])
    {
        int n=arr.length;
        int totalSum=0;
        for(int i=0;i<n;i++)
        {
            totalSum+=arr[i];
        }
        int leftSum=0;
        int rightSum=totalSum;
        for(int i=0;i<n;i++)
        {
            rightSum-=arr[i];
            if(leftSum==rightSum)
        {
            return i;
        }
        leftSum+=arr[i];
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={0,7,0,0,9,0,4,3};
        int index=P6PivotIndex.pivotIndex(arr);
        System.out.println(index);
        
    }
}
