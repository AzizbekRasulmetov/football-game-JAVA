package football;
import java.util.*;
public class Football {
		private static int INDEX = 0;
		private static int teamIndex = 0;
		private static final String [] TEAMS = {"Barcelona", "Real Madrid", "Chelsea", "Bavaria"};
		private static final String [] WINNERS = new String[2];
		private static ArrayList<Integer> randomNumbers = new ArrayList<Integer>();
		private static Scanner console = new Scanner(System.in);
		
		public void giveIntro() {
			System.out.println("\n                                      Fifa 2020");
			System.out.println();
			System.out.println("                                  Welcome to my Game ");
			System.out.println("                  There are 4 teams(Real Madrid, Barcelona, Bavaria, Chelsea)");
			System.out.println("                  You have to win to get to final fifa 2020.");
			System.out.println("                  In this game you have to guess a number between 1-3 to score a goal");
			System.out.println("                  Both teams have 10 chances.");
			System.out.println();
			System.out.println("                                      Good Luck!");
			System.out.println();
		}
		
		public void startGame() throws InterruptedException {
			
			for(int i = 1; i <= 2; i++) {
				int p1Score = 0, p2Score = 0;
				int p1Attempts = 10, p2Attempts = 10;
				int randomTeam1 = teamIndex;
				teamIndex++;
				int randomTeam2 = teamIndex;
				teamIndex++;
				
				System.out.println("                                   " + TEAMS[randomTeam1] + " vs " + TEAMS[randomTeam2]);
				System.out.println();
				Thread.sleep(2000);
				while(p1Attempts != 0 && p2Attempts !=0) {
					
					if(p1Attempts == 5) {
						System.out.println("\n First time ended");
						Thread.sleep(2000);
						System.out.println("\n Second time starts");
						Thread.sleep(2000);
						System.out.println();
					}
					
					int randomNum = (int) (Math.random() * 3 + 1);
					System.out.println(TEAMS[randomTeam1] + " attacking......");
					System.out.print("Number from 1-3 ");
					int getP1Num = console.nextInt();
					p1Attempts--;
					if(getP1Num == randomNum) {
						p1Score++;
						System.out.println("                           ****************");
						System.out.println("                            GOAL!!! (" + p1Score + " - " +p2Score + ")");
						System.out.println("                           ****************");                    
					}else {
						System.out.println(" -------");
						System.out.println("| MISS! |");
						System.out.println(" -------");
					}
					
					Thread.sleep(1000);
					
					randomNum = (int)(Math.random() * 3 + 1);
					System.out.println(TEAMS[randomTeam2] + " attacking too....");
					System.out.print("Number from 1-3 ");
					int getP2Num = console.nextInt();
					p2Attempts--;
					if(getP2Num == randomNum) {
						p2Score++;
						System.out.println("                           ****************");
						System.out.println("                            GOAL!!! (" + p1Score + " - " +p2Score + ")");
						System.out.println("                           ****************");                 
					}else {
						System.out.println(" -------");
						System.out.println("| MISS! |");
						System.out.println(" -------");
					}
					
					Thread.sleep(1000);
				}// end of while loop
				
				
				Thread.sleep(1000);
				
				System.out.println();
				System.out.println("                                    Game Ended.");
				System.out.println();
			
				if(p1Score > p2Score) {
					System.out.println(TEAMS[randomTeam1] + " won! (" + p1Score + " - " + p2Score + ")");
					WINNERS[INDEX] = TEAMS[randomTeam1];
					INDEX++;
					System.out.println(TEAMS[randomTeam1] + " is in Final!");
				}else if(p1Score < p2Score) {
					System.out.println(TEAMS[randomTeam2] + " won! (" + p2Score + " - " + p1Score + ")");
					WINNERS[INDEX] = TEAMS[randomTeam2];
					INDEX++;
					System.out.println(TEAMS[randomTeam2] + " is in Final!");
				}else {
					System.out.println("\n                               Draw!");
					System.out.println(TEAMS[randomTeam1] + " - " + TEAMS[randomTeam2] + "(" + p1Score + " - " + p2Score + ")");
					rematch(randomTeam1, randomTeam2);
				}
				System.out.println();
			}	
			System.out.println();
			finalGame(WINNERS);
		}
		
		public static void rematch(int team1, int team2) throws InterruptedException {
			int p1Score = 0, p2Score = 0;
			int p1Attempts = 10, p2Attempts = 10;
			
			System.out.println("\n                                     " + TEAMS[team1] + " vs " + TEAMS[team2]);
			Thread.sleep(2000);
			while(p1Attempts != 0 && p2Attempts !=0) {
				
				if(p1Attempts == 5) {
					System.out.println("\n First time ended");
					Thread.sleep(2000);
					System.out.println("\n Second time starts");
					Thread.sleep(2000);
					System.out.println();
				}
				
				int randomNum = (int) (Math.random() * 3 + 1);
				System.out.println(TEAMS[team1] + " attacking......");
				System.out.print("Number from 1-3 ");
				int getP1Num = console.nextInt();
				p1Attempts--;
				if(getP1Num == randomNum) {
					p1Score++;
					System.out.println("                           ****************");
					System.out.println("                            GOAL!!! (" + p1Score + " - " +p2Score + ")");
					System.out.println("                           ****************");                    
				}else {
					System.out.println(" -------");
					System.out.println("| MISS! |");
					System.out.println(" -------");
					
				}
				
				Thread.sleep(1000);
				
				randomNum = (int)(Math.random() * 3 + 1);
				System.out.println(TEAMS[team2] + " attacking too....");
				System.out.print("Number from 1-3 ");
				int getP2Num = console.nextInt();
				p2Attempts--;
				if(getP2Num == randomNum) {
					p2Score++;
					System.out.println("                           ****************");
					System.out.println("                            GOAL!!! (" + p1Score + " - " +p2Score + ")");
					System.out.println("                           ****************");                      
				}else {
					System.out.println(" -------");
					System.out.println("| MISS! |");
					System.out.println(" -------");
				}
				
				Thread.sleep(1000);
			}// end of while loop
			
			
			Thread.sleep(1000);
			
			System.out.println();
			System.out.println("                                    Game Ended.");
			System.out.println();
		
			if(p1Score > p2Score) {
				System.out.println(TEAMS[team1] + " won! (" + p1Score + " - " + p2Score + ")");
				WINNERS[INDEX] = TEAMS[team1];
				INDEX++;
				System.out.println(TEAMS[team1] + " is in Final!");
			}else if(p1Score < p2Score) {
				System.out.println(TEAMS[team2] + " won! (" + p2Score + " - " + p1Score + ")");
				WINNERS[INDEX] = TEAMS[team2];
				INDEX++;
				System.out.println(TEAMS[team2] + " is in Final!");
			}else {
				System.out.println("                                  Draw!");
				System.out.println(TEAMS[team1] + " - " + TEAMS[team2] + "(" + p1Score + " - " + p2Score + ")");
				rematch(team1, team2);
			}
			System.out.println();
		}
		
		public static void finalGame(String[] winners) throws InterruptedException {
			
			System.out.println("\n                                FINAL");
			System.out.println("\n                           " + winners[0] + " vs " + winners[1]);
			
				
				int p1Score = 0, p2Score = 0;
				int p1Attempts = 10, p2Attempts = 10;
			
				while(p1Attempts != 0 && p2Attempts !=0) {
				
					int randomNum = (int) (Math.random() * 3 + 1);
					int randomPlayer = (int)(Math.random() * 5);
					System.out.println(winners[0] + " attacking......");
					System.out.print("Number from 1-3 ");
					int getP1Num = console.nextInt();
					p1Attempts--;
					if(getP1Num == randomNum) {
						p1Score++;
						System.out.println("                           ****************");
						System.out.println("                            GOAL!!! (" + p1Score + " - " +p2Score + ")");
						System.out.println("                           ****************");                       
					}else {
						System.out.println(" -------");
						System.out.println("| MISS! |");
						System.out.println(" -------");
					}
					
					Thread.sleep(1000);
					
					randomNum = (int)(Math.random() * 3 + 1);
					System.out.println(winners[1] + " attacking too....");
					System.out.print("Number from 1-3 ");
					int getP2Num = console.nextInt();
					p2Attempts--;
					if(getP2Num == randomNum) {
						p2Score++;
						System.out.println("                           ****************");
						System.out.println("                            GOAL!!! (" + p1Score + " - " +p2Score + ")");
						System.out.println("                           ****************");                  
					}else {
						System.out.println(" -------");
						System.out.println("| MISS! |");
						System.out.println(" -------");
					}
					
					Thread.sleep(1000);
				}// end of while loop
				
				Thread.sleep(1000);
				
				System.out.println();
				System.out.println("                                    Game Ended.");
				System.out.println();
				
				if(p1Score > p2Score) {
					System.out.println("*****************************************************************************************************************************");
					System.out.println(winners[0] + " is CHAMPION (" + p1Score + " - " + p2Score + ")");
					System.out.println("*****************************************************************************************************************************");
					Thread.sleep(2000);
					System.out.println("*****************************************************************************************************************************");
					System.out.println("Uraaaaaa!!!!");
					Thread.sleep(2000);
					System.out.println(winners[0] + " CHAMP!!!!!!!!");
					Thread.sleep(1000);
					System.out.println("Champ Champ Champ");
					System.out.println("*****************************************************************************************************************************");
				}else if(p1Score < p2Score) {
					System.out.println("*****************************************************************************************************************************");
					System.out.println(winners[1] + " is CHAMPION (" + p2Score + " - " + p1Score + ")");
					System.out.println("*****************************************************************************************************************************");
					Thread.sleep(2000);
					System.out.println("*****************************************************************************************************************************");
					System.out.println("Uraaaaaa!!!!");
					Thread.sleep(2000);
					System.out.println(winners[1] + " CHAMP!!!!!!!!");
					Thread.sleep(1000);
					System.out.println("Champ Champ Champ");
					System.out.println("*****************************************************************************************************************************");
				}else {
					System.out.println("*****************************************************************************************************************************");
					System.out.println(winners[0] +" - " + winners[1] + " (" + p1Score + " - " + p2Score + ")");
					System.out.println("*****************************************************************************************************************************");
				}

	}
}


