package java_Pgms;

//import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class removeDupInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String[] dd=s.split(" ");
		LinkedHashSet<Object> set = new LinkedHashSet<>();
		for(int i=0;i<dd.length;i++)
		{
			set.add(dd[i]);
		}
		for(String dd1:set) {
			System.out.println(dd1);
		}
	}
}