package parrot;

public interface Parrot {

    public double getSpeed() ;
    public String getHabitation();
    default double getBaseSpeed() {
    	return 12;
    }


}


