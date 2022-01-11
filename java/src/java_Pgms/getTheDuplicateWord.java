package java_Pgms;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class getTheDuplicateWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String[] sarr = s.split(" ");
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		for(String word:sarr)
		{
			set.add(word);
		}
		for(String word1:set)
		{
			int count=0;
			for(String word2:sarr)
			{
				if(word1.equals(word2))
				{
				count++;
			}
		}
		if(count>1)
		{
			System.out.println(word1);
		}
	}

}
}
