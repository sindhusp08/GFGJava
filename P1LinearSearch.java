public class P1LinearSearch {
    public static int linearSearch(int arr[],int key)
    {      
      int n=arr.length;
        for(int i=0;i<n;i++)
        {
            if (arr[i]==key)
            {
                return i;
                
            }
        
        }
      return -1;
           
    }
    public static void main(String[] args) {
        int arr[]={1,3,6,0,5};
       int r= P1LinearSearch.linearSearch(arr, 90);
        System.out.println(r);
    
}
}
