package java_Pgms;

public class pgmToRevEachWordInSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="my name is sanjay";
		String[] strArr=str.split(" ");
		for(int i=0;i<strArr.length;i++)
		{
			String s=strArr[i];
			for(int j=s.length()-1;j>=0;j--) 
			{
			System.out.print(s.charAt(j));	
			}
			System.out.print(" ");
		}
	}

}
