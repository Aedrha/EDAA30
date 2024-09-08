package parrot;

public class Norwegian_Blue extends Parrot{
	private double voltage;
    private boolean isNailed;
    
    public Norwegian_Blue(double v, boolean n) {
    	this.type = ParrotTypeEnum.NORWEGIAN_BLUE;
    	this.voltage = v;
    	this.isNailed = n;
    	this.habitation = (isNailed) ? "In cages." : "Nowhere.";
    }
    @Override
    public double getSpeed() {
    	return (isNailed) ? 0 : getBaseSpeed(voltage);
    }
    
    @Override
    public String getHabitation() {
    	return habitation;
    }
    private double getBaseSpeed(double voltage) {
        return Math.min(24.0, voltage * getBaseSpeed());
    }
	
    
    
}