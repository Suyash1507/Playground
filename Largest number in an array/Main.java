import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
      Scanner in= new Scanner(System.in);
      int arr_size= in.nextInt();
      int arr[]= new int[arr_size];
      int i;
      for(i=0;i<=(arr_size-1);i++)
      {
        arr[i]= in.nextInt();
      }
      int max= arr[0];
      for(i=0;i<=arr_size-1;i++)
      {
        if(max<arr[i])
        {
          max=arr[i];
        }
      }
      System.out.println(max);
 
    }
}