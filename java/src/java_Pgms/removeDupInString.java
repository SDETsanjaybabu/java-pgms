package java_Pgms;

//import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class removeDupInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		LinkedHashSet<Object> set = new LinkedHashSet<>();
		for(int i=0;i<s.length();i++)
		{
			set.add(s.charAt(i));
		}
		for(Object ch:set)
		{
			System.out.print(ch);
		}
	}

}
