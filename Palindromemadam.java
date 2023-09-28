package week1.day1;

public class Palindromemadam {
	public static void main(String[] args) {
		String name="madam";
				String rev="";
				
				char[] charArray=name.toCharArray();
				for(int i=charArray.length-1;i>=0;i--)
				{
					//System.out.println(charArray[i]);
					
					rev=rev+charArray[i];			
				}
				System.out.println(rev);
				if(rev.equals(name))
				{
					System.out.println("both are equal");
				}
				else
				{
					System.out.println("both are not equal");
				}
	}

}
