import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner sc=new Scanner(System.in);
      String str=sc.nextLine();
      String str1="";
      for(int i=str.length()-1;i>=0;i--)
      {
      	str1=str1+str.charAt(i);
      }
      if(str.equals(str1))
        System.out.print("Yes");
      else
        System.out.print("No");
    } 
}