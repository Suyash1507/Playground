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
    max_elem(list,n);
  }
  public static void max_elem(int list[], int n)
  {
    int max= list[0];
    int index=0;
    for(int i=0;i<n;i++)
    {
      if(max<list[i])
      {
        max= list[i];
        index= i;
      }
    }
    System.out.print(index);
  }
  
}