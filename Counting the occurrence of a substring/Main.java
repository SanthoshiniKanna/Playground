import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    // Type your code here
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    String src=sc.nextLine();
    int count=0;
    for(int i=0;i<str.length()-src.length()+1;i++)
    {
      	boolean match=true;
    	for(int j=0;j<src.length();j++)
        {
          if(src.charAt(j)!=str.charAt(i+j))
          {
            match=false;
          }
        }
      if(match==true)
      {
      	count++;
      }
    }
    System.out.println(count);
  } 
}