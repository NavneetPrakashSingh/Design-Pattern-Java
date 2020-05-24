package Behavioral.Strategy;

public class Main {
	public static void main(String[] args) {
		DragonSlayer dragonObj = new DragonSlayer();
		dragonObj.changeStrategy(Strategy.FLY);
		dragonObj.executeStrategy();
		
		dragonObj.changeStrategy(Strategy.SWIM);
		dragonObj.executeStrategy();
	}
}
