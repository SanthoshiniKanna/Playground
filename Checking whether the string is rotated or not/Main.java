import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     	// Type your code here
      Scanner sc=new Scanner(System.in);
      String str1=sc.nextLine();
      String str2=sc.nextLine();
      StringBuilder sb1=new StringBuilder(str1);
      StringBuilder sb2=new StringBuilder(str2);
      StringBuilder temp=new StringBuilder("");
      //temp=str1+str1;
      for(int i=0;i<str1.length();i++)
      {
      	temp=temp.append(str1.charAt(i));
      }
      for(int i=0;i<str1.length();i++)
        temp=temp.append(str1.charAt(i));
      int l1=sb1.length();
      int l2=sb2.length();
      int tl=temp.length();
      int indx = substring1(temp,tl,sb2,l2);
      if(indx==-1)
        System.out.print("No");
      else
        System.out.print("Yes");
      
      
    }
  	public static int substring1(StringBuilder str1,int l1,StringBuilder str2,int l2)
    {
    int matching_idx= -1;
        for (int i = 0; i <l1 - l2 + 1; i++)
        {
            boolean is_matching = true;
            for(int j = 0; j < l2; j++)
            {
                if(str1.charAt(i + j) != str2.charAt(j))
                {
                    is_matching = false;
                }
            }
            if(is_matching == true)
            {
                matching_idx = i;
                break;
            }
        }
        return matching_idx;
    }
}