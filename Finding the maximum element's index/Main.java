import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
      a[i]=sc.nextInt();
    int max=a[0];
    int index=0;
    int i=0;
    for(i=1;i<n;i++)
    {
    	if(max<a[i])
        {
        	max=a[i];
          	index=i;
        }
    }
    System.out.print(index);
  }
}