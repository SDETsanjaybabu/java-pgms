package java_Pgms;

public class HappyNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=123;
		
		int n=num;
		while(n>9)
		{
			int sum=0;
			while(n>0)
			{
				int ld=n%10;
				sum=sum+ld;
				n=n/10;
			}
			n=sum;
			}
		System.out.println(n);
		}
}