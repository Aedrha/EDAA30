package parrot;

public class EuropeanParrot extends Parrot {
	
	
	public EuropeanParrot() {
		super();
		this.habitation = "In a nest made of sticks.";
		this.type = ParrotTypeEnum.EUROPEAN;
		// TODO Auto-generated constructor stub
	}
    
	@Override
    public double getSpeed() {
        return getBaseSpeed();
    }
    @Override
    public String getHabitation() {
    	return habitation;
    }

	
}