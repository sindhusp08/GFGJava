import java.io.*;
//Binary Search is applicable for sorted array
public class P2BinarySearch
{
    public static int binarySearch(int arr[],int target)
    {
        int n=arr.length;
        int s=0;
        int e=n-1;
        
        while(s<=e)
        {
            int mid =(s+e)/2;
            
                if(arr[mid]==target)
                {
                    return mid;
                }
                else if(arr[mid]< target)
                {
                    s=mid+1;
                }
                else if(arr[mid]> target)
                {
                    e=mid-1;
                }

         }
                return -1;
    }
    public static void main(String[] args) {
        int arr[]={2,5,8,9,11};
        int d=P2BinarySearch.binarySearch(arr,99);
        System.out.println(d);
    }

    
          
}
    