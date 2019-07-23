import java.util.Scanner;
class Main
{
  public static int square(int n)
    {
    	int p;
      p=n*n;
      return p;
    }
	public static void main (String[] args)
    {
	 // Type your code here   
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int x=square(n);
      System.out.print(x);                   
	} 
  	
}