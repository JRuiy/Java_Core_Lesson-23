package ua.lviv.lgs;

public class Human {

	private double weight;
	private double growth;

	public Human(double weight, double growth) {
		super();
		this.weight = weight;
		this.growth = growth;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getGrowth() {
		return growth;
	}

	public void setGrowth(double growth) {
		this.growth = growth;
	}

	@Override
	public String toString() {
		return "Human [weight=" + weight + ", growth=" + growth + "]";
	}

}
