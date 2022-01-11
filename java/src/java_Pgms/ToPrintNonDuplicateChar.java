package java_Pgms;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class ToPrintNonDuplicateChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++)
		{
			set.add(s.charAt(i));
		}
		System.out.println(set);
		for(char ch:set)
		{
			int  count=0;
		for(int i=0;i<s.length();i++)
		{
			if(ch==s.charAt(i))
			{
				count++;
			}
	}
		if(count==1)//to print non duplicate
		{
			System.out.println(ch);
		}

}
	}

}
