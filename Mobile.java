package week1.day1;

public class Mobile {
	public void powerOn() {
		System.out.println("POWER ON THE MOBILE");
	}
	public void enterPasscode() {
		System.out.println("ENTER THE PASSCODE");
	}public void openApps() {
		System.out.println("OPEN THE APPLICATION");
	}public void turnOnData() {
		System.out.println("TURN ON THE DATA");
	}public void openInsta() {
		System.out.println("OPEN THE INSTAGRAM");
	}
	
	public static void main(String[] args) {
		Mobile iphone =new Mobile();
		iphone.powerOn();
		iphone.enterPasscode();
		iphone.openApps();
		iphone.turnOnData();
		iphone.openInsta();
	}

}
