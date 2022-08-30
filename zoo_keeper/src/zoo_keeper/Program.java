package zoo_keeper;

public class Program {
	public static void main(String[] args) {
		
		
		Bat bat = new Bat(); 
		
		System.out.println("Bat's default energy level is" + " " + bat.getEnergyLevel());
		
		bat.fly(2);
		System.out.println("Bat is tired and his energy drops to" + " " + bat.getEnergyLevel());
		
		bat.eatHuman(2);
		System.out.println("Human is tasty, my level is now" + " " + bat.getEnergyLevel());
		
		bat.attackTown(3);
		System.out.println("Fire is soooo hot, my level is now" + " " + bat.getEnergyLevel());
	}
}
