package java_Pgms;

public class ToAppend0satTheLastInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= {1,0,6,0,5,5,0};
		int[] arr2= new int[arr1.length];
		int m=0;
		int n=arr1.length-1;
		for(int i=0;i<arr1.length;i++)
		{
			if(arr1[i]==0)
			{
				arr2[n]=arr1[i];
				n--;
			}else {
				arr2[m]=arr1[i];
				m++;
			}
		}
		for(int i=0;i<arr2.length;i++)
		{
			System.out.println(arr2[i]+" ");
		}
	}
}