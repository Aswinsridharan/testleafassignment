package week1.day1;

public class Car {
		public void openDoor() {
			System.out.println("open door");
		}
		public void insetKey() {
			System.out.println("INSERT KEY");
		}
		public void startEngine() {
			System.out.println("STRAT ENGINE");
		}
		public void applyGear() {
			System.out.println("applyGear");
		}
public static void main(String[] args) {
	Car honda=new Car();
	honda.openDoor();
	honda.insetKey();
	honda.startEngine();
	honda.applyGear();
	
}
}


