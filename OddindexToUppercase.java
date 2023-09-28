package week1.day1;

public class OddindexToUppercase {
public static void main(String[] args) {
	String text="changeme";
	String add="";
	char[] arrays=text.toCharArray();
	for(int i=0;i<arrays.length;i++)
	{
		if(i%2!=0)
		{
			System.out.println(arrays[i]);
			add=add+arrays[i];
			
		}
		
	}
	System.out.println(add.toUpperCase());
	
}
}
