import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      prime(n);
	}
  	public static void prime(int n)
    {
      int f=1,i=2;
      for(i=2;i<n;i++)
      {
      	for(int j=2;j<i;j++)
        {
        	if(i%j==0)
            {
            	f=0;
              break;
            }
          else
            f=1;;
        }
       if(f==1)
         System.out.println(i);
          
      } 
    }
}