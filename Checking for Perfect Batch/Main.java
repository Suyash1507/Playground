import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in= new Scanner(System.in);
    int n= in.nextInt();
    int list[]= new int[n];
    int i=0,sum=0;
    for(i=0;i<n;i++)
    {
      list[i]= in.nextInt();
    }
    perfect_batch(list,n); 
  }
  public static void perfect_batch(int list[], int n)
  {
    boolean is_matched= true;
    int real_sum;
    int batch_sum= list[0]+ list[1]+ list[2];
    for(int i=3;i<n;i=i+3)
    {
      real_sum= list[i]+list[i+1]+list[i+2];
      if(real_sum!= batch_sum)
      {
        is_matched= false;
      }
    }
    if(is_matched== true)
    {
      System.out.println("Perfect Batch");
    }
    else
    {
      System.out.println("Not a Perfect Batch");
    }
  }
}