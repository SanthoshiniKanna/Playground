import java.util.Scanner;
class Main{
	public static void main (String[] args){
    	// Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int p=1;
      for(int i=1;i<=n;i++)
      {
      	for(int j=1;j<n-(i-1);j++)
          System.out.print(" ");
        for(int k=1;k<=i;k++)
        {
        	System.out.print(p+" ");
          p=p+1;
        }
        System.out.println();
      }
    }    
}