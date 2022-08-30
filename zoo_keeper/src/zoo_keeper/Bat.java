package zoo_keeper;

public class Bat extends Mammal {
	public void fly(int numFly) {
		System.out.println("123 flying Bat took off...");
		super.setEnergyLevel(getEnergyLevel()-50 * numFly);
	}
	

	public void eatHuman(int numHumanAte) {
		System.out.println("so-well, never mind...");
		super.setEnergyLevel(getEnergyLevel()-50 *numHumanAte);
		
	}
	

	public void attackTown(int numTown) {
		System.out.println("fire...");
		super.setEnergyLevel(getEnergyLevel()-100 *numTown);
		
	}
}
