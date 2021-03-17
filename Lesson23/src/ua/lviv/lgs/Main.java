package ua.lviv.lgs;

import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Main {

	static void menu() {
		System.out.println("Введіть 1 щоб додати фракцію");
		System.out.println("Введіть 2 щоб видалити конкретну фракцію");
		System.out.println("Введіть 3 щоб вивести усі  фракції");
		System.out.println("Введіть 4 щоб очистити конкретну фракцію");
		System.out.println("Введіть 5 щоб вивести конкретну фракцію");
		System.out.println("Введіть 6 щоб додати депутата в фракцію");
		System.out.println("Введіть 7 щоб видалити депутата з фракції");
		System.out.println("Введіть 8 щоб вивести список хабарників");
		System.out.println("Введіть 9 щоб вивести найбільшого хабарника");
	}

	public static void main(String[] args) {

		menu();
		Scanner sc = new Scanner(System.in);
		VerkhovnaRada rada = new VerkhovnaRada();
		List<Faction> faction = rada.getFaction();

		while (true) {
			switch (sc.next()) {
			case "1": {
				System.out.println("Ведіть назву фракції, яку хочете додати");
				sc = new Scanner(System.in);
				String inputFaction = sc.next();
				rada.addFaction(inputFaction);
				break;
			}
			case "2": {
				System.out.println("Ведіть назву фракції, яку хочете видалити");
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
				System.out.println("Ведіть назву фракції, з якої хочете видалити всіх депутатів");
				sc = new Scanner(System.in);
				String inputFaction = sc.next();
				rada.deleteAllDeputyFromFaction(inputFaction);
				break;
			}
			case "5": {
				System.out.println("Ведіть назву фракції, яку хочете вивести");
				sc = new Scanner(System.in);
				String inputFaction = sc.next();
				rada.specificFaction(inputFaction);
				break;
			}
			case "6": {
				System.out.println("Ведіть назву фракції до якої хочете додати депутата");
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
				System.out.println("Чи депутат хабарник? (true or false)");
				boolean bribeTaker = sc.nextBoolean();
				rada.addDeputyToFaction(inputFaction, weight, growth, lastName, firstName, bribeTaker);
				break;
			}
			case "7": {
				System.out.println("Ведіть назву фракції до якої хочете додати депутата");
				sc = new Scanner(System.in);
				String inputFaction = sc.next();
				System.out.println("Ведіть прізвище");
				String lastName = sc.next();
				System.out.println("Ведіть ім'я");
				String firstName = sc.next();
				rada.deleteDeputyFromFaction(inputFaction, lastName, firstName);
				break;
			}
			case "8": {
				System.out.println("Ведіть назву фракції з якої хочете побачити всіх хабарників");
				sc = new Scanner(System.in);
				String inputFaction = sc.next();
				rada.allBribeOfFaction(inputFaction);
				break;
			}
			case "9": {
				System.out.println("Ведіть назву фракції, щоб дізнатися найбльшого хабаника з неї");
				sc = new Scanner(System.in);
				String inputFaction = sc.next();
				rada.bigestBribeOfFaction(inputFaction);
				break;
			}
			}

		}

	}
}
