package java_Pgms;

public class Vowels {
public static void main(String[] args) {
	String s1="india";
	int count=0;
	char ch[]=s1.toCharArray();
	for(int i=0;i<ch.length;i++)
	{
		if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
		{
			count++;
		}
	}
	System.out.println("vowels are= "+count);
}
}