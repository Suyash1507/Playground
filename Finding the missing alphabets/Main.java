import java.util.Scanner;
class Main{
    public static void main(String[] args)
    {
        Scanner in= new Scanner(System.in);
	    String s= in.nextLine();
	    int stat[]= new int[26];
	    int s_len= s.length();
	    for(int i=0;i<26;i++)
	    {
	        stat[i]=0;
	    }
	    for(int i=0;i<s_len;i++)
	    {
	        if(s.charAt(i)>='a' && s.charAt(i)<='z')
	        {
	            int offset= s.charAt(i)- 'a';
	            stat[offset]++;
	        }
	        else if(s.charAt(i)>='A' &&s.charAt(i)<='Z')
	        {
	            int offset= s.charAt(i)-'A';
	            stat[offset]++;
	        }
	    }
	    for(int i=0;i<26;i++)
	    {
	        if(stat[i]==0)
	        {
	            char missing_alpha= (char)(i+'a');
	            System.out.print(missing_alpha+ " ");
	        }
	    }
    }
}
