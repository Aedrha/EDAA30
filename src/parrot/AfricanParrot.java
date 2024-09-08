package parrot;

public class AfricanParrot extends Parrot {
	private int numberOfCoconuts;
	
	public AfricanParrot(int nbrCoconuts) {
		this.habitation = "In holes in trees.";
		this.numberOfCoconuts = nbrCoconuts;
		this.type = ParrotTypeEnum.AFRICAN;
	}
	
	@Override
	public double getSpeed() {
		return Math.max(0, getBaseSpeed() - getLoadFactor() * numberOfCoconuts);
	}
	
    @Override
    public String getHabitation() {
    	return habitation;
    }
	
	   private double getLoadFactor() {
	        return 9.0;
	    }
}