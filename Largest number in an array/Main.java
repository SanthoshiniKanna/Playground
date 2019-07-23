import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code 
      int i=0;
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a[]=new int[n];
      for(i=0;i<n;i++)
        a[i]=sc.nextInt();
      int m=0;
      for(i=0;i<n;i++)
      {
      	if(a[i]>m)
          m=a[i];
      }
      System.out.print(m);
    }
}