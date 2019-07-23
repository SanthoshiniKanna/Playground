import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int p=0,r=0,fac=1,temp=0;
      p=n;
      while(p!=0)
      {
      	r=p%10;
        fac=1;
        for(int i=1;i<=r;i++)
        	fac=fac*i;
         temp+=fac;
        p=p/10;
      }
      if(temp==n)
      	System.out.println("Yes");
      else
        System.out.println("No");
	}
}