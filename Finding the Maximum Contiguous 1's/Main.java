import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
	    	// type your code here
	      Scanner sc=new Scanner(System.in);
	      int l=sc.nextInt();
	      int[] arr=new int[l];
	      for(int i=0;i<l;i++)
	        arr[i]=sc.nextInt();
	      int count=0,max=0;
	      for(int i=0;i<l;i++)
	      {
	      	if(arr[i]==1)
	        {
	          count=0;
	          while(i<l && arr[i]==1)
	          {
	          	count++;
	            i++;
	          }
	        }
	          if(count>max)
	            max=count;
	    }
	   System.out.print(max);
	    }
}