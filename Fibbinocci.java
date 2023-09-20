package week1.day1;

public class Fibbinocci {
	public static void main(String[] args) {
		 int num1=0,num2=1,num3;
	        for(int i =0;i<=11;i++)
	        { System.out.println(num1);
	            num3=num1+num2;
	            num1=num2;
	            num2=num3;

	        }
	}
}
