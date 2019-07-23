import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int p=1;
      for(int i=1;i<=n;i++)
      {
      	for(int j=1;j<=(n-i);j++)
        	System.out.print(" ");
        for(int k=1;k<=p;k++)
        {
          System.out.print("*");
        }
        System.out.println();
        p=p+2;
      }
	}
}