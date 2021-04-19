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
		this(mode); // this(); �⺻�����ڸ� ȣ���Ѵ�
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
			System.out.println("�̱���");
			break;
		}
	}

	public void config(int mode) {
		this.mode = mode;
	}

	void pvp() {
		while (true) {
			System.out.println((turn + 1) + " ��  > ");
			System.out.println("Player" + (turn % numOfPlayer + 1) + "�� ���� >");
			int slot = sc.nextInt();

			if (barrel.fork(slot)) {
				if (barrel.checkGameOver()) {
					System.out.println("�� �������� ���ư����ϴ�...");
					System.out.println("Player" + (turn % numOfPlayer + 1) + "�� �й� >");
					break;
				}
				turn++;
			}
		}
	}

	void pvc() {
		while (endCheck) {
			System.out.println((turn + 1) + " ��  > ");

			if (turn % 2 == 0) {
				System.out.println("Player�� ���� >");
				int slot = sc.nextInt();
			
				if (barrel.fork(slot)) {
					if (barrel.checkGameOver()) {
						System.out.println("�� �������� ���ư����ϴ�...");
						System.out.println("Player�� �й� ");
						endCheck = false;
						break;
					}
					turn++;
				}
			} else {
				System.out.println("ComPuter�� ���� >");
				int slot = (int) (Math.random() * 20) + 1;
				System.out.print(slot + "\n");
				
				if (barrel.fork(slot)) {
					if (barrel.checkGameOver()) {
						System.out.println("�� �������� ���ư����ϴ�...");
						System.out.println("ComPuter�� �й� ");
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

		System.out.println("�׽�Ʈ ���� ��!");
	}
}
