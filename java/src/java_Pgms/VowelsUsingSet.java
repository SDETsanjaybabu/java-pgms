package java_Pgms;

import java.util.LinkedHashSet;

public class VowelsUsingSet {
public static void main(String[] args) {
	String s1="india";
	char ch[]=s1.toCharArray();
	
	LinkedHashSet<Character> set=new LinkedHashSet<Character>();
	for(int i=0;i<s1.length();i++)
	{
		set.add(s1.charAt(i));
	}
	int count=0;
	for (char ch1 : set) 
	{
		if(ch1=='a'||ch1=='e'||ch1=='i'||ch1=='o'||ch1=='u')
		{
			count++;
		}
	}
	System.out.println(s1+":"+count);
}
}