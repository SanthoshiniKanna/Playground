import java.util.Scanner;
class Main { 
	public static void main(String[] args){
  		Scanner in = new Scanner(System.in);
  		// Type your code here
      int n=in.nextInt();
      int i,j;
      char p;
      p='*';
      for(i=1;i<=n;i++)
      {
      	for(j=1;j<=i;j++)
        {
        	System.out.print(p);
          	if(p=='*')
              p='#';
          else
            p='*';
        }
        System.out.println();
      }
    }
}