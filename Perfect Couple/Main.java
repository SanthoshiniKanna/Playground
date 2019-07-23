import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      // Type your code here
      Scanner sc=new Scanner(System.in);
      int l=sc.nextInt();
      int[] arr=new int[l];
      int i=0,j=0;
      for(i=0;i<l;i++)
        arr[i]=sc.nextInt();
      int value=sc.nextInt();
      for(i=0;i<l;i++)
      {
      	for(j=i+1;j<l;j++)
        {
        	if(arr[i]+arr[j]==value)
              System.out.println(arr[i]+", "+arr[j]);
        }
      }
    }
}