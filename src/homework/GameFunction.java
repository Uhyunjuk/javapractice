package homework;

import java.util.Random;
import java.util.Scanner;

public class GameFunction {
	Game game;
	
	public GameFunction() {
		game = new Game();
	}

	public int printMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("☆★☆★☆★ 혼자 놀기 ☆★☆★☆★");
		System.out.println();
		System.out.println("1. 내 프로필 작성해보기");
		System.out.println("2. 내 프로필 보기");
		System.out.println("3. 게임하기");
		System.out.println("4. 혼자놀기 끝");
		System.out.println();
		System.out.print("무엇을 선택할까? : ");
//		System.out.println("☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★");
		int menu = sc.nextInt();
		return menu;
	}

	public void inputProfile() {
		Scanner sc = new Scanner(System.in);
		System.out.println("☆★☆★☆★ 내 프로필을 작성해보자!☆★☆★☆★");
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("좋아하는 음식 : ");
		String food = sc.next();
		System.out.print("좋아하는 색깔 : ");
		String color = sc.next();
		game.setName(name);
		game.setFood(food);
		game.setColor(color);
	}

	public void printProfile() {
		System.out.println("☆★☆★☆★ 내 프로필 보기 ☆★☆★☆★");
		System.out.println("내 이름은 " + game.getName() +"야 ^^*");
		System.out.println("좋아하는 음식은 " + game.getFood() + "이고");
		System.out.println("좋아하는 색깔은 " + game.getColor() + "이야ㅎㅎ");
		System.out.println();

	}

	public void gameChoice() {
		Scanner sc = new Scanner(System.in);
		System.out.println("☆★☆★☆★☆★☆★☆★☆★☆★☆★ 게임을 골라보자 ☆★☆★☆★☆★☆★☆★☆★☆★☆★");
		System.out.println();
		System.out.println("1번 : 동전 앞뒤 맞추기    2번 : 로또 번호 자동 생성기");
		System.out.println();
		System.out.print("무엇을 선택할까? : ");
		int menu = sc.nextInt();
		if (menu == 1) {
			Scanner sc1 = new Scanner(System.in);
			Random rand = new Random();
			System.out.println("☆★☆★☆★ 동전 앞 뒤 맞추기 게임☆★☆★☆★");
			System.out.print("숫자를 입력해주세요. (1. 앞면 / 2. 뒷면) : ");
			int choice = sc.nextInt();
			int computer = rand.nextInt(2) + 1;
			System.out.println(".");
			System.out.println(".");
			System.out.println(".");
			System.out.println("컴퓨터는 " + computer + " 을/를 골랐네요!");

			if (choice == computer) {
				System.out.println("맞췄습니다!");
			} else {
				System.out.println("틀렸습니다!");

			}
		} else {
			System.out.println("☆★☆★☆★ 로또 번호를 자동으로 추첨합니다 ☆★☆★☆★");
			System.out.println(".");
			System.out.println(".");
			System.out.println(".");
			int[] lotto = new int[6];
			Random rand = new Random();
			for (int i = 0; i < lotto.length; i++) {
				lotto[i] = rand.nextInt(45) + 1;
				for (int j = 0; j < i; j++) {
					if (lotto[i] == lotto[j]) {
						i--;
						break;
					}
				}
			}
			for (int i = 0; i < lotto.length; i++) {
				for (int j = i + 1; j < lotto.length; j++) {
					if (lotto[i] > lotto[j]) {
						int temp = lotto[i];
						lotto[i] = lotto[j];
						lotto[j] = temp;
					}

				}

			}
			for (int i = 0; i < lotto.length; i++) {
				System.out.printf(lotto[i] + " ");
			}
			System.out.printf("짜잔~" + "%n");
			System.out.println();
		}
	}

//	public void coinGame() {
//		Scanner sc = new Scanner(System.in);
//		Random rand = new Random();
//		System.out.println("☆★☆★☆★ 동전 앞 뒤 맞추기를 선택하셨네요! ☆★☆★☆★");
//		System.out.println("☆★☆★☆★ 시작해볼까요! ☆★☆★☆★");
//		System.out.println(".");
//		System.out.println(".");
//		System.out.println(".");
//		System.out.print("숫자를 입력해주세요. (1. 앞면 / 2. 뒷면) : ");
//		int choice = sc.nextInt();
//		int computer = rand.nextInt(2) + 1;
//		System.out.println("컴퓨터는 ... " + computer + " 을 골랐네요!");
//
//		if (choice == computer) {
//			System.out.println("맞췄습니다!");
//		} else {
//			System.out.println("틀렸습니다ㅜㅜ");
//
//		}
//	}

//	public void lottoGame() {
//		System.out.println("☆★☆★☆★ 로또 번호를 자동으로 추첨합니다~ ☆★☆★☆★");
//		System.out.println(".");
//		System.out.println(".");
//		System.out.println(".");
//		int[] lotto = new int[6];
//		Random rand = new Random();
//		for (int i = 0; i < lotto.length; i++) {
//			lotto[i] = rand.nextInt(45) + 1;
//			for (int j = 0; j < i; j++) {
//				if (lotto[i] == lotto[j]) {
//					i--;
//					break;
//				}
//			}
//		}
//		for (int i = 0; i < lotto.length; i++) {
//			for (int j = i + 1; j < lotto.length; j++) {
//				if (lotto[i] > lotto[j]) {
//					int temp = lotto[i];
//					lotto[i] = lotto[j];
//					lotto[j] = temp;
//				}
//
//			}
//
//		}
//		for (int i = 0; i < lotto.length; i++) {
//			System.out.print(lotto[i] + " ");
//		}
//		System.out.println();
//	}

	public void goodByeMsg() {
		System.out.println("혼자 놀기를 끝냅니다. Bye~");
	}

	public void exceptionMsg() {
		System.out.println("1 ~ 4사이의 숫자를 입력해주세요");
	}
}
