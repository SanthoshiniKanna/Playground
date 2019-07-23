import java.util.Scanner;
class Main{
  public static int sum(int n)
  {
  	int p,x;
    p=n*(n+1);
    x=p/2;
    return x;
  }
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int y=sum(n);
      System.out.print(y);
	}
}