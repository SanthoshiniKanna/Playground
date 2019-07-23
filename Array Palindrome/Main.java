import java.util.Scanner;
import java.util.Arrays;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner sc=new Scanner(System.in);
      int size=sc.nextInt();
      int[] arr=new int[size];
      for(int i=0;i<size;i++)
        arr[i]=sc.nextInt();
      int[] rev=new int[size];
      int flag=0;
     for (int i = 0; i <= size / 2 && size != 0; i++) {
            if (arr[i] != arr[size - i - 1]) { 
                flag = 1; 
                break; }}
       	if(flag==1)
          System.out.print("No");
       else
         System.out.print("Yes");
    }
}