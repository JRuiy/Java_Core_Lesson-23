package ua.lviv.lgs;

public class Deputy extends Human {

	public Deputy(double weight, double growth) {
		super(weight, growth);
	}

	String lastName;
	String firstName;
	boolean bribeTaker;
	double brideSize;

	public Deputy(double weight, double growth, String lastName, String firstName, boolean bribeTaker) {
		super(weight, growth);
		this.lastName = lastName;
		this.firstName = firstName;
		this.bribeTaker = bribeTaker;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public boolean isBribe() {
		return bribeTaker;
	}

	public void setBribe(boolean bribe) {
		this.bribeTaker = bribe;
	}

	public double getBrideSize() {
		return brideSize;
	}

	public void setBrideSize(double brideSize) {
		this.brideSize = brideSize;
	}

	@Override
	public String toString() {
		return "Deputy [lastName=" + lastName + ", firstName=" + firstName + ", bribeTaker=" + bribeTaker
				+ ", brideSize=" + brideSize + ", getWeight()=" + getWeight() + ", getGrowth()=" + getGrowth() + "]";
	}

	public double giveBribe(double bride) {
		if (!bribeTaker) {
			System.out.println("Цей депутат не бере хабарів");
		} else {
			if (brideSize > 5000) {
				System.out.println("Поліція ув'язнить депутата");
			} else {
				return this.brideSize = bride;
			}
		}
		return bride;
	}

}
