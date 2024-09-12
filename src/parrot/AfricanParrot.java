package parrot;

public record AfricanParrot(int nbrCoconuts) implements Parrot {
	
	

	
	public double getSpeed() {
		return Math.max(0, 12 - getLoadFactor() * nbrCoconuts);
	}
	
    public String getHabitation() {
    	return "In holes in trees.";
    }
	
	   private double getLoadFactor() {
	        return 9.0;
	    }
}