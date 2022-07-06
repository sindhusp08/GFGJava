

class BubbleSort{  

    public static void sorting(int arr[])
    {
        int n = arr.length;
        int i,j;
        for( i=0; i<n-1; i++)
        {
            for( j=0; j<n-i-1; j++)
            {
                if(arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp; 
                }
                //System.out.println(arr[j]+" ");

                // 2,3,5,4,1
            }
           
            
        }
        System.out.print(arr[i]+" ");
    }

    public static void main(String args[]){  
       
            int arr[]={3,2,5,4,1};
           BubbleSort.sorting(arr);
        //    for(int i=0;i<arr.length;i++)
        //    System.out.print(arr[i]);
        
    }  
}  
