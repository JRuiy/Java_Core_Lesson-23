package ua.lviv.lgs;

import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Main {

	static void menu() {
		System.out.println("������ 1 ��� ������ �������");
		System.out.println("������ 2 ��� �������� ��������� �������");
		System.out.println("������ 3 ��� ������� ��  �������");
		System.out.println("������ 4 ��� �������� ��������� �������");
		System.out.println("������ 5 ��� ������� ��������� �������");
		System.out.println("������ 6 ��� ������ �������� � �������");
		System.out.println("������ 7 ��� �������� �������� � �������");
		System.out.println("������ 8 ��� ������� ������ ���������");
		System.out.println("������ 9 ��� ������� ���������� ���������");
	}

	public static void main(String[] args) {

		menu();
		Scanner sc = new Scanner(System.in);
		VerkhovnaRada rada = new VerkhovnaRada();
		List<Faction> faction = rada.getFaction();

		while (true) {
			switch (sc.next()) {
			case "1": {
				System.out.println("����� ����� �������, ��� ������ ������");
				sc = new Scanner(System.in);
				String inputFaction = sc.next();
				rada.addFaction(inputFaction);
				break;
			}
			case "2": {
				System.out.println("����� ����� �������, ��� ������ ��������");
				sc = new Scanner(System.in);
				String inputFaction = sc.next();
				rada.deleteFaction(inputFaction);
				break;
			}
			case "3": {
				Consumer<Faction> allFaction = x -> System.out.println(rada.faction);
				allFaction.accept(null);
				break;
			}
			case "4": {
				System.out.println("����� ����� �������, � ��� ������ �������� ��� ��������");
				sc = new Scanner(System.in);
				String inputFaction = sc.next();
				rada.deleteAllDeputyFromFaction(inputFaction);
				break;
			}
			case "5": {
				System.out.println("����� ����� �������, ��� ������ �������");
				sc = new Scanner(System.in);
				String inputFaction = sc.next();
				rada.specificFaction(inputFaction);
				break;
			}
			case "6": {
				System.out.println("����� ����� ������� �� ��� ������ ������ ��������");
				sc = new Scanner(System.in);
				String inputFaction = sc.next();
				System.out.println("Enter weight");
				double weight = sc.nextInt();
				System.out.println("Enter growth");
				double growth = sc.nextInt();
				System.out.println("Enter Last Name");
				String lastName = sc.next();
				System.out.println("Enter First Name");
				String firstName = sc.next();
				System.out.println("�� ������� ��������? (true or false)");
				boolean bribeTaker = sc.nextBoolean();
				rada.addDeputyToFaction(inputFaction, weight, growth, lastName, firstName, bribeTaker);
				break;
			}
			case "7": {
				System.out.println("����� ����� ������� �� ��� ������ ������ ��������");
				sc = new Scanner(System.in);
				String inputFaction = sc.next();
				System.out.println("����� �������");
				String lastName = sc.next();
				System.out.println("����� ��'�");
				String firstName = sc.next();
				rada.deleteDeputyFromFaction(inputFaction, lastName, firstName);
				break;
			}
			case "8": {
				System.out.println("����� ����� ������� � ��� ������ �������� ��� ���������");
				sc = new Scanner(System.in);
				String inputFaction = sc.next();
				rada.allBribeOfFaction(inputFaction);
				break;
			}
			case "9": {
				System.out.println("����� ����� �������, ��� �������� ���������� �������� � ��");
				sc = new Scanner(System.in);
				String inputFaction = sc.next();
				rada.bigestBribeOfFaction(inputFaction);
				break;
			}
			}

		}

	}
}
