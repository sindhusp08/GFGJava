public class P4MoveZeroEnd
{
    public static void moveZeroEnd(int arr[])
    {
        int n=arr.length;
        int j=0 ,temp;
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=0 && i!=j)
            {
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;    

            }    
            
        }    
    }
    public static void main(String[] args) {
        int arr[]={0,2,4,0,5,7};
        P4MoveZeroEnd.moveZeroEnd(arr);
        for (int i=0; i<= arr.length-1; i++) 
        {
            System.out.print(arr[i] + ",");
        } 

    }
}