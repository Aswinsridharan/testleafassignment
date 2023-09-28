package week1.day1;

public class RemoveDuplicates {
	public static void main(String[] args) {
		String text="we learn java basics as part of java sessions in java week1";
		int count=0;
		String[] arrr= null;
		arrr=text.split(" ");
		for(int i=0;i<arrr.length;i++)
		{
			//System.out.println(arrr[i]);
			for(int j=i+1;j<arrr.length;j++)
			{
				if(arrr[i].equals(arrr[j]))
				{
				System.out.println(arrr[j]);
				count++;
				}	
			}
		}
		if(count>1)
		{
			String replace=text.replace("java"," ");
			System.out.println(replace);
		}			
	}

}
