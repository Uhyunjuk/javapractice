package homework;

public class GameRun {

	public static void main(String[] args) {
		
		GameFunction gF = new GameFunction();
		BYE: while (true) {
			int choice = gF.printMenu();
			switch (choice) {
			case 1:
				gF.inputProfile();
				break;
			case 2:
				gF.printProfile();
				break;
			case 3:
				gF.gameChoice();
				break;
			case 4:
				gF.goodByeMsg();
				break BYE;
			default:
				gF.exceptionMsg();
				break;
			}
		}
	}

}
