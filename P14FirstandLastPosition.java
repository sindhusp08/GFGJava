public class P14FirstandLastPosition
{
    public static void returnFirstLastPosition(int arr[],int target)
    {
        int n=arr.length;
        int s=0;
        int e=n-1;
        //int mid=(s+e)/2;
        
        int first=-1,last=-1;
        //first occurence
        while (s<=e)
        {
            int mid=(s+e)/2;
            if(arr[mid]==target)
            {
                first=mid ;
                e=mid-1;
            }
            else if(arr[mid] > target)
            {
                e=mid-1;
            }
            else
            {
                s=mid+1;
            }
           
        }

            s=first;
            e=n-1;
            //last occurence
            while (s<=e)
         {
            int mid=(s+e)/2;
            if(arr[mid]==target)
            {
                last=mid ;
                s=mid+1;
            }
            else if(arr[mid] > target)
            {
                e=mid-1;
            }
            else
            {
                s=mid+1;
            }
        }
        System.out.print(first +"---" +last);
    }
    
    public static void main(String[] args) {
        int arr[]={1,4,5,9,9,9,99,100};
         returnFirstLastPosition(arr,9);
   
        
    }
}
