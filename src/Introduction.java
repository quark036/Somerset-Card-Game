import java.util.Scanner;
import java.util.ArrayList;

public class Introduction
	{
		static ArrayList <Player> playerList = new ArrayList<Player>();
		public static void introduce()
		{
			System.out.println("Hello and welcome to Somerset. Do you have four players playing today?");
			Scanner userInput = new Scanner (System.in);
			String response = userInput.nextLine();
			if (response.equals("no") || response.equals("No") || response.equals("NO"))
				{
					System.out.println("I'm sorry, but unfortunately this is a four player game.");
					System.out.println("Run this program again when you have found four players.");
					System.exit(0);
				}
			System.out.println();
			System.out.println("That's great news!");
			System.out.println();
			System.out.println("What is the first player's name?");
			String playerOneName = userInput.nextLine();
			playerList.add(new Player(playerOneName, 1, 0, 0, false));
			System.out.println("Welcome " + playerOneName + "!");
			System.out.println();
			System.out.println("What is the second player's name?");
			String playerTwoName = userInput.nextLine();
			playerList.add(new Player(playerTwoName, 2, 0, 0, false));
			System.out.println("Welcome " + playerTwoName + "!");
			System.out.println();
			System.out.println("What is the third player's name?");
			String playerThreeName = userInput.nextLine();
			playerList.add(new Player(playerThreeName, 3, 0 ,0, false));
			System.out.println("Welcome " + playerThreeName + "!"); 
			System.out.println();
			System.out.println("What is the fourth player's name?");
			String playerFourName = userInput.nextLine();
			playerList.add(new Player(playerFourName, 4, 0, 0, false));
			System.out.println("Welcome " + playerFourName + "!");
			System.out.println();
		}
		
		public static void choosePartners()
		{
			Scanner userResponse = new Scanner (System.in);
			System.out.println("Now you will choose your partners.");
			System.out.println("1)" + playerList.get(0).getPlayerName() + " & " + playerList.get(1).getPlayerName() + "    vs.    " + playerList.get(2).getPlayerName() + " & " + playerList.get(3).getPlayerName());
			System.out.println("2)" + playerList.get(0).getPlayerName() + " & " + playerList.get(2).getPlayerName() + "    vs.    " + playerList.get(1).getPlayerName() + " & " +  playerList.get(3).getPlayerName());
			System.out.println("3)" + playerList.get(0).getPlayerName() + " & " +  playerList.get(3).getPlayerName() + "    vs.   " + playerList.get(1).getPlayerName() + " & " + playerList.get(2).getPlayerName());
			System.out.println("Please choose the number that indicates the pairings you would like to play with.");
			int partners = userResponse.nextInt();
			System.out.println();
			System.out.println();
			if (partners == 1)
				{
					System.out.println(playerList.get(0).getPlayerName() + " & " + playerList.get(1).getPlayerName() + " will play against " + playerList.get(2).getPlayerName() + " & " +  playerList.get(3).getPlayerName());
					playerList.get(0).setPlayerTeamNumber(1);
					playerList.get(0).setPlayerHand(1);
					playerList.get(1).setPlayerTeamNumber(1);
					playerList.get(1).setPlayerHand(3);
					playerList.get(2).setPlayerTeamNumber(2);
					playerList.get(2).setPlayerHand(2);
					playerList.get(3).setPlayerTeamNumber(2);
					playerList.get(3).setPlayerHand(4);
					System.out.println();
					System.out.println();
				}
			else if (partners == 2)
				{
					System.out.println(playerList.get(0).getPlayerName() + " & " + playerList.get(2).getPlayerName() + " will play against " + playerList.get(1).getPlayerName() + " & " +  playerList.get(3).getPlayerName());
					playerList.get(0).setPlayerTeamNumber(1);
					playerList.get(0).setPlayerHand(1);
					playerList.get(2).setPlayerTeamNumber(1);
					playerList.get(2).setPlayerHand(3);
					playerList.get(1).setPlayerTeamNumber(2);
					playerList.get(1).setPlayerHand(2);
					playerList.get(3).setPlayerTeamNumber(2);
					playerList.get(3).setPlayerHand(4);
					System.out.println();
					System.out.println();
				}
			else if (partners == 3)
				{
					System.out.println(playerList.get(0).getPlayerName() + " & " +  playerList.get(3).getPlayerName() + " will play against " + playerList.get(1).getPlayerName() + " & " + playerList.get(2).getPlayerName());
					playerList.get(0).setPlayerTeamNumber(1);
					playerList.get(0).setPlayerHand(1);
					playerList.get(3).setPlayerTeamNumber(1);
					playerList.get(3).setPlayerHand(3);
					playerList.get(1).setPlayerTeamNumber(2);
					playerList.get(1).setPlayerHand(2);
					playerList.get(2).setPlayerTeamNumber(2);
					playerList.get(2).setPlayerHand(4);
					System.out.println();
					System.out.println();
				}
		}
	}
