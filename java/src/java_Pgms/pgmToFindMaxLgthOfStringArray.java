package java_Pgms;

public class pgmToFindMaxLgthOfStringArray {

	public static void main(String[] args) {
		// TODO Auto`-generated method stub
		String[] str={"a","abc","xyz","sanjay","sanjaybabu"};
		String maxlength=str[0];
		for(int i=1;i<str.length;i++) {
			if(maxlength.length()<str[i].length())
			{
			maxlength=str[i];
			}
		}
		for(int i=0;i<str.length;i++)
		{
			if(maxlength.length()==str[i].length())
			{
				System.out.println(str[i]);
			}
		}
	}

}
