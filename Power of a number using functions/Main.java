import java.util.Scanner;
import java.lang.Math;
class Main{
	public static void main(String args[])
    {
    	Scanner sc=new Scanner(System.in);
      	int b=sc.nextInt();
      int e=sc.nextInt();
      double p=power(b,e);
      System.out.print(p);
    }
	public static int power(int b,int e)
    {
    	int x;
      	x=(int)Math.pow(b,e);
      	return x;
    }

}