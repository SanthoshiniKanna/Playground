import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      int i=0;
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a[]=new int[n];
      for(i=0;i<n;i++)
      	a[i]=sc.nextInt();
      int x=sc.nextInt();
      int y=sc.nextInt();
      int p=-1;
      int l=-1,m=-1;
      int s[]={-1,-1};
     for(i=0;i<n;i++)
     {
     	if(x==a[i])
        {
          s[0]=i;
        }
     }
      for(i=0;i<n;i++)
     {
     	if(y==a[i])
        {
          s[1]=i;
        }
     }
      System.out.println(s[0]);
      System.out.print(s[1]);
    }
}