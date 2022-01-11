package java_Pgms;

public class revStringForeach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="sanjay";
		char[] name=s1.toCharArray();
		int count=0;
		for(@SuppressWarnings("unused") char ch:name)
		{
			count++;
		}
		for(int i=count-1;i>=0;i--)
			System.out.println(name[i]);
	}

}
