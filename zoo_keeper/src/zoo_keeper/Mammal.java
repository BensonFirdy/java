package zoo_keeper;

public class Mammal {

		private int energyLevel = 300;

		
		
		public Mammal() {
			super();
		}
		
		public Mammal(int energyLevel) {
			super();
			this.energyLevel = energyLevel;
		}


		public int getEnergyLevel() {
			return energyLevel;
		}
		
		public void setEnergyLevel(int energyLevel) {
			this.energyLevel = energyLevel;
		}
		
}
