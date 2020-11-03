package football;
import java.util.*;

public class Game {
	
	private final String [] players1 = {"Ramos", "Crooz", "Lucas", "Modrich", "Rodrigez"};
	private final String [] players2 = {"Messi", "Grizman", "Usman", "Alberto", "Fati"};
	
	public void giveIntro() {
		System.out.println("                                      Fifa 2020");
		System.out.println();
		System.out.println("                                  Welcome to my Game ");
		System.out.println("                  There are 2 teams (Real Madrid - Barcelona) ");
		System.out.println("                  In this game you have to guess a number between 1-3 to score a goal");
		System.out.println("                  Both teams have 10 chances.");
		System.out.println();
		System.out.println("                                      Good Luck!");
		System.out.println();
	}
	
	public void startGame() throws InterruptedException {
		Scanner console = new Scanner(System.in);
		
		int p1Score = 0, p2Score = 0;
		int p1Attempts = 10, p2Attempts = 10;
		
		while(p1Attempts != 0 && p2Attempts !=0) {
			
			int randomNum = (int) (Math.random() * 3 + 1);
			int randomPlayer = (int)(Math.random() * 5);
			System.out.println("Real Madrid attacking......");
			System.out.print("Number from 1-3 ");
			int getP1Num = console.nextInt();
			p1Attempts--;
			if(getP1Num == randomNum) {
				p1Score++;
				System.out.println(players1[randomPlayer] + " scored a  GOAL!");
			}else {
				System.out.println("MISS!");
				
			}
			
			Thread.sleep(1000);
			
			randomNum = (int)(Math.random() * 3 + 1);
			System.out.println("Barcelona attacking too....");
			System.out.print("Number from 1-3 ");
			int getP2Num = console.nextInt();
			p2Attempts--;
			if(getP2Num == randomNum) {
				p2Score++;
				System.out.println(players2[randomPlayer] + " scored a GOAL!");
			}else {
				System.out.println("MISS!");
			}
			
			Thread.sleep(1000);
		}// end of while loop
		
		Thread.sleep(1000);
		
		System.out.println();
		System.out.println("Game Ended.");
		System.out.println();
		
		if(p1Score > p2Score) {
			System.out.println("Real Madrid won! (" + p1Score + " - " + p2Score + ")");
		}else if(p1Score < p2Score) {
			System.out.println("Barcelona won! (" + p2Score + " - " + p1Score + ")");
		}else {
			System.out.println("Real Madrid - Barcelona (" + p1Score + " - " + p2Score + ")");
		}
	}
	
	
}
