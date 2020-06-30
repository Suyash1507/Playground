import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
	    Scanner in= new Scanner(System.in);
	    String s= in.nextLine();
	    StringBuilder sb = new StringBuilder(s);
	    int stat[]= new int[26];
	    int s_len= s.length();
	    for(int i=0;i<26;i++)
	    {
	        stat[i]=0;
	    }
	    for(int i=0;i<s_len;i++)
	    {
	        
	        if(sb.charAt(i)>='A' && sb.charAt(i)<='Z')
	        {
	            int offset= sb.charAt(i)-'A';
	            char ch = (char)('a' + offset);
                sb.setCharAt(i, ch);
	        }
	        if(sb.charAt(i)>='a' && sb.charAt(i)<='z')
	        {
	            int offset= sb.charAt(i)- 'a';
	            stat[offset]++;
	        }
	    }
	    for(int i=0;i<s_len;i++)
	    {
	        if(stat[sb.charAt(i)-'a']!=0)
	        {
	            System.out.print(sb.charAt(i)+ ""+stat[sb.charAt(i)-'a']+" ");
	            stat[sb.charAt(i)-'a']=0;
	            
	        }
	        
	    }
	    
	}
}
