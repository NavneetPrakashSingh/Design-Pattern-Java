package Behavioral.Strategy;

public class DragonSlayer {
	IDragonSlayerStrategy dragonStrategy;
	
	public DragonSlayer() {
		
	}
	
	public void changeStrategy(Strategy behavior) {
		//TODO: remove if else from here and change it to a factory
		if(behavior.equals(Strategy.FLY)) {
			dragonStrategy = new FlyStrategy();
		}else if(behavior.equals(Strategy.SWIM)) {
			dragonStrategy = new SwimStrategy();
		}
	}
	
	public void executeStrategy() {
		dragonStrategy.execute();
	}
}
