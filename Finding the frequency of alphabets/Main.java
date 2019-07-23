import java.util.Scanner;
public class Main {
	public static void main(String args[])
    {
        // Type your code here
      Scanner sc=new Scanner(System.in);
      String str=sc.nextLine();
      StringBuilder sb=new StringBuilder(str);
      int l=str.length();
      str=str.toLowerCase();
      int freq[]=new int[26];
     	    for(int idx = 0; idx < l; idx++)
	        {
	            if(sb.charAt(idx) >= 'A' && sb.charAt(idx) <= 'Z')
	            {
	                freq[sb.charAt(idx) - 'A']++;
	            }
	            if(sb.charAt(idx) >= 'a' && sb.charAt(idx) <= 'z')
	            {
	                freq[sb.charAt(idx) - 'a']++;
	            }  
	        }
      for(int i=0;i<l;i++)
      {
        if(freq[str.charAt(i)-'a']!=0)
        {
        	System.out.print(str.charAt(i));
	         System.out.print(freq[str.charAt(i) - 'a']+" ");
	         freq[str.charAt(i) - 'a'] = 0; 
	         
        }
      } 
    }
}
