package java_Pgms;

public class pgmToFindMinLnthStrArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str= {"hi","hello","sanjay","I"};
		String minlength=str[0];
		for(int i=1;i<str.length;i++)
		{
			if(minlength.length()>str[i].length())
			{
				minlength=str[i];
			}
		}
		for(int i=0;i<str.length;i++)
		{
			if(minlength.length()==str[i].length())
			{
				System.out.println(str[i]);
			}
		}
	}
}