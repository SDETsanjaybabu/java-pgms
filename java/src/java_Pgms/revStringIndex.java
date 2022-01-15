package java_Pgms;

public class revStringIndex {

	public static void main(String[] args) {
	String s1="sanjay";
	char[] name=s1.toCharArray();
	for(int i=name.length-1;i>=0;i--)
		System.out.println(name[i]);
	}
}