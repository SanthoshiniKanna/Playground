import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
	    // type your code here
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int temp=n;
	    int c=0;
	    if(temp<0)
	      temp=-1*temp;
	    while(temp>0)
	    {
	    	temp=temp/10;
	      	c++;
	    }
	    temp=n;
	    if(n<0)
	      c=c+1;
	    char str[]=new char[c];
	    
	    if(n<0)
	    {
	    	str[0]='-';
	      	n=n*-1;
	    }
	    	c=c-1;
	    while(n>0)
	    {
	    	char ch=(char)((n%10)+'0');
	      	n=n/10;
	      	str[c]=ch;
	      	c--;
	      
	    }
	    System.out.print(str);
	  }
}