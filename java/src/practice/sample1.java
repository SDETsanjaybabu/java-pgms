package practice;

public class sample1 {
public static void main(String[] args) {
	
	int a[]= {1,2,3,9,7};
	int b[]= {4,5,5};
	
	int count=a.length;
	if(a.length<b.length)
	{
		count=b.length;
	}
	for(int i=0;i<count;i++)
	{
		try {
		System.out.println(a[i]+b[i]+" ");
	}catch (Exception e) {
		// TODO: handle exception
	if(a.length>b.length)
	{
		System.out.println(a[i]+" ");
	}
	else
	{
		System.out.println(b[i]+" ");
	}
}
}
}
}