import java.util.Scanner;
class Main{
    public static void main(String args[]) 
    {
      Scanner in= new Scanner(System.in);
      int n= in.nextInt();
      int arr[]= new int[n];
      for(int i=0;i<n;i++)
      {
        arr[i]= in.nextInt();
      }
      int value= in.nextInt();
      value_element(n,arr,value);
    }
  public static void value_element(int n, int arr[], int value)
  {
    for(int i=0;i<n;i++)
    {
      for(int j= i+1;j<n;j++)
      {
        if(arr[i]+arr[j]== value)
        {
           System.out.println(arr[i] + ", " + arr[j]); 
        }
      }
    }
  }
}