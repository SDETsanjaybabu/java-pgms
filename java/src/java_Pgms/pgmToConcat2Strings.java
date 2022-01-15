package java_Pgms;

public class pgmToConcat2Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abc" + "xyz";
		for(int i=0;i<s.length()/2;i++)
		{
			System.out.print(s.charAt(i)+""+s.charAt(s.length()/2+i));
		}
	}
}