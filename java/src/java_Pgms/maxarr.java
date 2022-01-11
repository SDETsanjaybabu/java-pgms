package java_Pgms;

//import java.util.Iterator;

public class maxarr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,1,4,3,7,5};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
		}
	}
		//for(int k=0;k<arr.length;k++)
		//{
		System.out.println(arr[arr.length-1]);
	}

	}


