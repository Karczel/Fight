package Fight;

public class Athlete {
	private String name; // will have person class and then extend to Athlete (later)
	private String epithet;
//	private Praise praise; // for raving up the crowd/ player, I'll make another class just for praises + animation directions (later)
	private boolean fight = false;
	private double stamina;
	private double maxStamina;
	private double weight;
	private double currentHp;
	private double maxHp;
//	private int speed; //determine who will gain the upper hand or can do which moves before the opponent's reaction time(later) + determine animation speed

	
	//setter and getter
	public String getName() {
		return this.name;
	}
	public String getEpithet(){
		return this.epithet;
	}
	public double getMaxStamina() {
		return this.maxStamina;
	}
	public double getMaxHp() {
		return this.maxHp;
	}
	public double getStamina() {
		return this.stamina;
	}
	public double getWeight() {
		return this.weight;
	}
	public double getHp() {
		return this.maxHp;
	}
	public boolean getFight() {
		return this.fight;
	}
	// for fight system moderator
	public void setMaxHp(double hp) {
		this.maxHp = hp;
	}
	public void setMaxStamina(double stamina) {
		this.maxStamina = stamina;
	}
	public void setFight(boolean fight) {
		this.fight = fight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public Athlete(double stamina, double weight, double hp) {
		this.maxStamina = stamina;
		this.weight = weight;
		this.maxHp = hp;
	}
	
	public void rest(int second) {
		if ((this.stamina += second * 0.33) < maxStamina){
			this.stamina += second * 0.33;
		} else {
			this.stamina = getMaxStamina();
		}
		if ((currentHp += second * (1/100)* maxHp) < maxHp){
			this.currentHp += second * (1/100)* maxHp;
		} else {
			this.currentHp = getMaxHp();
		}
	}
	
	public void eat(double amount, String type) {
		 // if Athlete don't exercise in x moves, 
		// nutrition values may affect Athlete's stats differently
		
		//for now this function is not developed
	}

	public String toString() {
		return this.name + ", " + this.epithet + " : " + "hp: " + this.maxHp + "stamina: " + this.maxStamina;
	}
}
