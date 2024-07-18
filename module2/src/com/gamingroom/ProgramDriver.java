package com.gamingroom;

/**
 * Application start-up program
 * 
 * @author coce@snhu.edu
 */
public class ProgramDriver {
	
	/**
	 * The one-and-only main() method
	 * 
	 * @param args command line arguments
	 */
	public static void main(String[] args) {
		
		// FIXME: obtain reference to the singleton instance
		GameService service = GameService.getInstance();
		
		System.out.println("\nAbout to test initializing game data...");
		
		// initialize with some game data to test unique game names
		Game game1 = service.addGame("Game #1");
		System.out.println(game1);
		Game game2 = service.addGame("Game #2");
		System.out.println(game2);
		Game game7 = service.addGame("Game #7");
		System.out.println(game7);
		Game game8 = service.addGame("Game #8");
		System.out.println(game8);	
		Game game11 = service.addGame("Game #1");
		System.out.println(game11);
		Game game12 = service.addGame("Game #2");
		System.out.println(game12);
		Game game13 = service.addGame("Game #13");
		System.out.println(game13);
		
		// Add team to the game
		Team team1 = game1.addTeam("Team 1");
		System.out.println(team1);
		
		// Add 2nd team
		Team team2 = game1.addTeam("Team 2");
		System.out.println(team2);
		
		// Add 3rd team
		Team team3 = game1.addTeam("Team 3");
		System.out.println(team3);
		
		// Add 4th team with duplicate name
		Team team4 = game1.addTeam("Team 1");  // Should return existing Team1
		System.out.println(team4);
		
		// Add player to the team1
		Player player1 = team1.addPlayer("Player 1");
		System.out.println(player1);
		
		// Add 2nd player to the team1
		Player player2 = team1.addPlayer("Player 2");
		System.out.println(player2);
		
		// Add 3rd player to the team1
		Player player3 = team1.addPlayer("Player 3");
		System.out.println(player3);
		
		// Add 4th player to the team1 with duplicate player name
		Player player4 = team1.addPlayer("Player 1"); // Should return the existing Player1
		System.out.println(player4);	
		
		
		
		// use another class to prove there is only one instance
		SingletonTester tester = new SingletonTester();
		tester.testSingleton();
	}
}
