package football;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("                                  1 ->       Single Game    ");
		System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("                                  2 ->       ChampionShip    ");
		System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------");
		System.out.print("\n Press \"1\" for single game or \"2\" for championship  ");
		Scanner console = new Scanner(System.in);
		int n = console.nextInt();
		console.nextLine();
		if(n == 1) {
			Game game = new Game();
			game.giveIntro();
			try {
				game.startGame();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else if(n == 2) {
			Football f = new Football();
			f.giveIntro();
			try {
				f.startGame();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		

	}

}
