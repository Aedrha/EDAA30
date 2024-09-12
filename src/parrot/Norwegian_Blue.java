package parrot;

public record Norwegian_Blue(double voltage, boolean isNailed) implements Parrot{


    @Override
    public double getSpeed() {
    	return (isNailed) ? 0 : getBaseSpeed(voltage);
    }
    
    @Override
    public String getHabitation() {
    	return (isNailed) ? "In cages." : "Nowhere.";
    }
    private double getBaseSpeed(double voltage) {
        return Math.min(24.0, voltage * 12);
    }
	
    
    
}