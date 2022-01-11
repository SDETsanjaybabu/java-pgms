package java_Pgms;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class OrderOfOccurOfWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		//String s="my name is sanjay";
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String[] str=s.split(" ");
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		for(String word:str)
		{
			set.add(word);
		}
		System.out.println(set);
		for(String word1:set)
		{
			int count=0;
			for(String word2:str)
			{
				if(word1.equals(word2))
				{
					count++;
				}
			}
			System.out.println(word1+":"+count);
		}
	}
}