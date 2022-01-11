package java_Pgms;

import java.util.Scanner;

//import com.sun.java_cup.internal.runtime.Scanner;

public class sample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		
		//System.out.println(no);
		int no1=sc.nextInt();
		if(no1%5==0 && no1%3==0)
		{
			System.out.println("hi bye");
		}else if(no1%5==0)
		{
			System.out.println("hi");
		}else if(no1%3==0)
		{
			System.out.println("bye");
		}else {
			System.out.println("good bye");
		}
	}

}
