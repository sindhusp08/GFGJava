//JP morgan question on implementation of Bubble sort 
public class P13BubbleSort
{
    public static void bubbleSort(int arr[])
    {
        int n=arr.length;
        
        for( int i=0;i<n;i++) //iteration
        {
            for( int j=0;j<n-i-1 ;j++) //comparision
            {
                if(arr[j]> arr[j+1])
                {
                 int temp = arr[j];
                 arr[j]=arr[j+1];
                 arr[j+1]=temp;
                }
             } 
            
         }
         for(int k=0;k<n;k++) //printing the values within function
         {
             System.out.print(arr[k] +" --"); 
              
         }
    
     }      
        
    
public static void main(String[] args) {
    int arr[]={3,2,5,4,1};
        bubbleSort(arr);
}
}