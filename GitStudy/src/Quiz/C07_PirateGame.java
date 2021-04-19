package Quiz;

import java.util.Scanner;

import Quiz.tong.Barrel;

public class C07_PirateGame {

	Scanner sc;

	Barrel barrel;
	int mode;

	int turn;
	int numOfPlayer;
	boolean endCheck;

	public C07_PirateGame(int mode) {
		this.barrel = new Barrel(21);
		this.mode = mode;
		this.numOfPlayer = 2;
		this.sc = new Scanner(System.in);
		this.endCheck = true;
	}

	public C07_PirateGame(int mode, int numOfPlayer) {
		this(mode); // this(); 기본생성자를 호출한다
		this.numOfPlayer = numOfPlayer;
	}

	public void start() {
		switch (this.mode) {
		case 0:
			pvp();
			break;
		case 1:
			pvc();
			break;
		default:
			System.out.println("미구현");
			break;
		}
	}

	public void config(int mode) {
		this.mode = mode;
	}

	void pvp() {
		while (true) {
			System.out.println((turn + 1) + " 턴  > ");
			System.out.println("Player" + (turn % numOfPlayer + 1) + "의 차례 >");
			int slot = sc.nextInt();

			if (barrel.fork(slot)) {
				if (barrel.checkGameOver()) {
					System.out.println("통 아저씨가 날아갔습니다...");
					System.out.println("Player" + (turn % numOfPlayer + 1) + "의 패배 >");
					break;
				}
				turn++;
			}
		}
	}

	void pvc() {
		while (endCheck) {
			System.out.println((turn + 1) + " 턴  > ");

			if (turn % 2 == 0) {
				System.out.println("Player의 차례 >");
				int slot = sc.nextInt();
			
				if (barrel.fork(slot)) {
					if (barrel.checkGameOver()) {
						System.out.println("통 아저씨가 날아갔습니다...");
						System.out.println("Player의 패배 ");
						endCheck = false;
						break;
					}
					turn++;
				}
			} else {
				System.out.println("ComPuter의 차례 >");
				int slot = (int) (Math.random() * 20) + 1;
				System.out.print(slot + "\n");
				
				if (barrel.fork(slot)) {
					if (barrel.checkGameOver()) {
						System.out.println("통 아저씨가 날아갔습니다...");
						System.out.println("ComPuter의 패배 ");
						endCheck = false;
						break;
					}
					turn++;
				}
			}
		}
	}

	public static void main(String[] args) {
		C07_PirateGame testGame = new C07_PirateGame(1);
		testGame.start();
		testGame.config(1);
		testGame.start();

		System.out.println("테스트 게임 끝!");
	}
}
