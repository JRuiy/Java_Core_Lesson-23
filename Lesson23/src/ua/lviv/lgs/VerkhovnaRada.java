package ua.lviv.lgs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class VerkhovnaRada {

	List<Faction> faction = new ArrayList<Faction>();

	Faction faction2;

	public List<Faction> getFaction() {
		return faction;
	}

	public void setFaction(List<Faction> faction) {
		this.faction = faction;
	}

	public void addFaction(String factionName) {
		faction.add(new Faction(factionName, new ArrayList<Deputy>()));
	}

	public void deleteFaction(String factionName) {
		for (int i = 0; i < faction.size(); i++) {
			if (faction.get(i).getNameOfFaction().equals(factionName)) {
				faction.remove(faction.get(i));
			} else {
				System.out.println("Òàêî¿ ôðàêö³¿ íå ³ñíóº");
			}
		}
	}

//	public void allFaction() {
//		System.out.println(faction);
//	}

	public void specificFaction(String nameOfFaction) {
		for (int i = 0; i < faction.size(); i++) {
			if (faction.get(i).getNameOfFaction().equals(nameOfFaction)) {
				System.out.println(faction.get(i));
			}
		}
	}

	public void addDeputyToFaction(String nameFaction, double weight, double growth, String lastName, String firstName,
			boolean bribeTaker) {
		for (int i = 0; i < faction.size(); i++) {
			if (faction.get(i).getNameOfFaction().equals(nameFaction)) {
				faction.get(i).deputy.add(new Deputy(weight, growth, lastName, firstName, bribeTaker));
			}
		}
	}

	public void deleteDeputyFromFaction(String nameOfFaction, String lastName, String firstName) {
		for (int i = 0; i < faction.size(); i++) {
			if (faction.get(i).getNameOfFaction().equals(nameOfFaction)) {
				for (int j = 0; j < faction.get(i).deputy.size(); j++) {
					if (faction.get(i).deputy.get(j).getLastName().equalsIgnoreCase(lastName)
							&& faction.get(i).deputy.get(j).getFirstName().equalsIgnoreCase(firstName)) {
						faction.get(i).deputy.remove(j);
					}
				}
			}
		}
	}

	public void allBribeOfFaction(String nameOfFaction) {
		for (int i = 0; i < faction.size(); i++) {
			if (faction.get(i).getNameOfFaction().equals(nameOfFaction)) {
				for (int j = 0; j < faction.get(i).deputy.size(); j++) {
					if (faction.get(i).deputy.get(j).isBribe() == true) {
						System.out.println(faction.get(i).deputy.get(j));
					}
				}
			}
		}
	}

	public void bigestBribeOfFaction(String nameOfFaction) {
		for (int i = 0; i < faction.size(); i++) {
			if (faction.get(i).getNameOfFaction().equalsIgnoreCase(nameOfFaction)) {
				Collections.sort(faction.get(i).deputy, new BribeDeputyComparator());
				System.out.println(faction.get(i).deputy.get(0));
			}
		}
	}

	public void allDeputyOfFaction(String nameOfFaction) {
		for (int i = 0; i < faction.size(); i++) {
			if (faction.get(i).getNameOfFaction().equalsIgnoreCase(nameOfFaction)) {
				System.out.println(faction.get(i).deputy);
			}
		}
	}

	public void deleteAllDeputyFromFaction(String nameOfFaction) {
		for (int i = 0; i < faction.size(); i++) {
			if (faction.get(i).getNameOfFaction().equalsIgnoreCase(nameOfFaction)) {
				faction.get(i).deputy.clear();
			}
		}
	}

}
