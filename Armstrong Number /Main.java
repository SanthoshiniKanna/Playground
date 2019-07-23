import java.util.Scanner;
import java.lang.Math;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int p=0,count=0,r=0,rem=0,t=0;
      p=n;
      while(p!=0)
      {
        r=p%10;
        rem+=Math.pow(r,3);
        p=p/10;
        t++;
      }
      if(rem==n)
        System.out.println("Armstrong Number");
      else
        System.out.println("Not a Armstrong Number");
	}
}