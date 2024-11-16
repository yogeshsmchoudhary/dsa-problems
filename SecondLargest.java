public class SecondLargest{
    public static void main(String[]  args ){
        int arr[]={1,2,4,7,7,7,6};
        int largest=Integer.MIN_VALUE;
        int secondL=Integer.MIN_VALUE;

       for(int i=0;  i<arr.length ; i++)
       {
           if(arr[i] >largest)
           {
               secondL=largest;
               largest=arr[i];
           }
           else if (arr[i]<largest && arr[i] > secondL )
           {
                secondL=arr[i];
           }
      } 
 System.out.println(secondL);
    }
}