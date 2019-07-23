import java.util.Scanner;
class Main {
    public static void main(String[] args) 
    {
		// Type your code here
      Scanner sc=new Scanner(System.in);
      int sum=sc.nextInt();
      System.out.println(add(sum));
    }
  	public static int add(int sum)
    {
      if(sum==0)
        return 0;
    return sum+add(sum-1);
    }
      
}