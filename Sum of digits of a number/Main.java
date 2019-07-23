import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code 
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int i=0;
      while(n>0)
      {
        i+=n%10;
        n=n/10;
      }
      System.out.println(+i);
	}
}