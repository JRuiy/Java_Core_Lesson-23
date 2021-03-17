package ua.lviv.lgs;

import java.util.Comparator;

public class BribeDeputyComparator implements Comparator<Deputy> {

	@Override
	public int compare(Deputy o1, Deputy o2) {

		return o1.getBrideSize() > o2.getBrideSize() ? -1 : 1;
	}

}
