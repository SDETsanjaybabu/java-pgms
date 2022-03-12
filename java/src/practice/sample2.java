package practice;

public class sample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abcaabcda";
		for(int i=0;i<s.length();i++)
		{
			int count=1;
			char ch=s.charAt(i);
			for(int j=i+1;j<s.length();j++)
			{
				if(ch==s.charAt(j))
				{
					count++;
					i++;
				}else {
					break;
				}
			}
			System.out.println(ch+""+count);
		}
	}

}
