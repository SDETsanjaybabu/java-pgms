package java_Pgms;

public class pgmToRevString {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="India";
		String rev=" ";
		for(int i=0;i<s.length();i++)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
	}
}