package java_Pgms;

public class pgmSegregateTheChars {

	public static void main(String[] args) {
		String s="ab12@x3";
		String a1=" ";
		String num=" ";
		String sp=" ";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='a' && s.charAt(i)<='z' || s.charAt(i)>='A' && s.charAt(i)<='Z')
			{
			     a1=a1+s.charAt(i);
			}
			else if(s.charAt(i)>='0' && s.charAt(i)<='9')
			{
				num=num+s.charAt(i);
			}
			else {
				sp=sp+s.charAt(i);
			}
		}
		System.out.println(a1+num+sp);
	}
}