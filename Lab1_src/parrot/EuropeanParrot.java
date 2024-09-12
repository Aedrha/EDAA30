package parrot;

public record EuropeanParrot() implements Parrot {

	@Override
	public double getSpeed() {
		// TODO Auto-generated method stub
		return getBaseSpeed();
	}

	@Override
	public String getHabitation() {
		// TODO Auto-generated method stub
		return "In a nest made of sticks.";
	}



}