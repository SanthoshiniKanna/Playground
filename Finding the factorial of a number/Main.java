import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    System.out.print(fact(num));
  }
  public static int fact(int num)
  {
    if(num==0)
      return 1;
  	return num*(fact(num-1));
  }
}