import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
      // Type your code here
      Scanner sc=new Scanner(System.in);
    int l=sc.nextInt();
    int arr[]=new int[l];
    for(int i=0;i<l;i++)
      arr[i]=sc.nextInt();
    int val=sc.nextInt();
    int max=0;
    for(int i=0;i<l;i++)
    {
    	for(int j=0;j<l;j++)
    	{
    		if(arr[i]<arr[j])
    		{
    			max=arr[i];
    			arr[i]=arr[j];
    			arr[j]=max;
    		}
    	}
    }
        System.out.print(arr[l-val]);
    }   
}