package ua.lviv.lgs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Faction {

	String nameOfFaction;

	List<Deputy> deputy = new ArrayList<Deputy>();

	public Faction(String nameOfFaction, List<Deputy> deputy) {
		super();
		this.nameOfFaction = nameOfFaction;
		this.deputy = deputy;
	}

	public String getNameOfFaction() {
		return nameOfFaction;
	}

	public void setNameOfFaction(String nameOfFaction) {
		this.nameOfFaction = nameOfFaction;
	}

	public List<Deputy> getDeputy() {
		return deputy;
	}

	public void setDeputy(List<Deputy> deputy) {
		this.deputy = deputy;
	}

	@Override
	public String toString() {
		return "Faction [nameOfFaction=" + nameOfFaction + ", deputy=" + deputy + "]";
	}

	public void addDeputy() {
		Scanner scaner = new Scanner(System.in);
		System.out.println("Add deputy");
		System.out.println();
		System.out.println("Enter weight");
		int weight = scaner.nextInt();
		System.out.println("Enter growth");
		int growth = scaner.nextInt();
		System.out.println("Enter Last Name");
		String lastName = scaner.next();
		System.out.println("Enter First Name");
		String firstName = scaner.next();
		System.out.println("Is bribe taker or not (true or false)");
		boolean bribeTaker = scaner.nextBoolean();
		Stream<Deputy> deputyStream = Stream.of(new Deputy(weight, growth, lastName, firstName, bribeTaker));
//		deputy.add(new Deputy(weight, growth, lastName, firstName, bribeTaker));
		System.out.println(deputyStream);
	}

	
	
	public void deleteDeputy() {
		Scanner scaner = new Scanner(System.in);
		System.out.println("Delete deputy");
		System.out.println();
		System.out.println("Enter Last Name");
		String lastName = scaner.next();
		System.out.println("Enter First Name");
		String firstName = scaner.next();

		for (int i = 0; i < deputy.size(); i++) {
			if (deputy.get(i).getLastName().equals(lastName) && deputy.get(i).getFirstName().equals(firstName)) {
				deputy.remove(i);
			} else {
				System.out.println("Такого депутата не існує");
			}
		}
	}

}
