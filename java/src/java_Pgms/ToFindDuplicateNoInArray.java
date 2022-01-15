package java_Pgms;

import java.util.LinkedHashSet;

public class ToFindDuplicateNoInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,2,4,1};
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		for(int i=0;i<arr.length;i++)
		{
			set.add(arr[i]);
		}
		for (Integer n : set) 
		{
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(n==arr[i])
			{
			count++;
		}
		}
		if(count>1)
		{
			System.out.println(n);
			//break;
		}
	
	}
}
}
