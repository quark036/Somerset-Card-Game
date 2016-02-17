import java.util.Scanner;
import java.util.ArrayList;
public class Hand
	{
		static int bid = 14;
		static int playerBid = 0;
		static int bidder = 0;
		static int lead = 0;
		static int turn = 0;
		static int suitLed = 0;
		static int teamOneScore = 0;
		static int teamTwoScore = 0;
		static ArrayList<Card> cardsInTrick = new ArrayList<Card>();
		static ArrayList<Card> trump = new ArrayList<Card>();
		static ArrayList<Card> toRemove = new ArrayList<Card>();
		public static void bid()
		{
			for (Player person : Introduction.playerList)
				{
					if (person.getPlayerHand()==1)
						{
							System.out.println(person.getPlayerName() + " will be the first bidder.");
							System.out.println(person.getPlayerName() + ", this is your hand.");
							if (person.getPlayerHand()==1)
							{
								Deck.displayPlayerOneHand();
							}
							if (person.getPlayerHand()==2)
							{
								Deck.displayPlayerTwoHand();
							}
							if (person.getPlayerHand()==3)
							{
								Deck.displayPlayerThreeHand();
							}
							if (person.getPlayerHand()==4)
							{
								Deck.displayPlayerFourHand();
							}
							System.out.println();
							playerBid(1);
						}
				}
			for (Player person : Introduction.playerList)
			{
				if (person.getPlayerHand()==2)
					{
						System.out.println(person.getPlayerName() + ", it is now your bid.");
						if (bid == 14 || bid == 0)
						{
							System.out.println();
							System.out.println("There is no bid yet. Bidding to you.");
							System.out.println();
						}
						else
						{
							System.out.println();
							System.out.println("The current bid is " + bid + ".");
							System.out.println();
						}
						System.out.println(person.getPlayerName() + ", this is your hand.");
						if (person.getPlayerHand()==1)
						{
							Deck.displayPlayerOneHand();
						}
						if (person.getPlayerHand()==2)
						{
							Deck.displayPlayerTwoHand();
						}
						if (person.getPlayerHand()==3)
						{
							Deck.displayPlayerThreeHand();
						}
						if (person.getPlayerHand()==4)
						{
							Deck.displayPlayerFourHand();
						}
						playerBid(2);
						System.out.println();
					}
			}
			for (Player person : Introduction.playerList)
			{
				if (person.getPlayerHand()==3)
					{
						System.out.println(person.getPlayerName() + ", it is now your bid.");
						if (bid == 14 || bid == 0)
						{
							System.out.println();
							System.out.println("There is no bid yet. Bidding to you.");
							System.out.println();
						}
						else
						{
							System.out.println();
							System.out.println("The current bid is " + bid + ".");
							System.out.println();
						}	
						System.out.println(person.getPlayerName() + ", this is your hand.");
						if (person.getPlayerHand()==1)
						{
							Deck.displayPlayerOneHand();
						}
						if (person.getPlayerHand()==2)
						{
							Deck.displayPlayerTwoHand();
						}
						if (person.getPlayerHand()==3)
						{
							Deck.displayPlayerThreeHand();
						}
						if (person.getPlayerHand()==4)
						{
							Deck.displayPlayerFourHand();
						}
						playerBid(3);
						System.out.println();
					}
			}
			for (Player person : Introduction.playerList)
			{
				if (person.getPlayerHand()==4)
					{
						System.out.println(person.getPlayerName() + ", you are the final bidder.");
						if (bid == 14 || bid == 0)
						{
							System.out.println();
							System.out.println("There is no bid yet. As the last bidder, you are stuck. You now have the bid for 15.");
							bidder=4;
							lead =4;
						}	
						else
							{
							System.out.println();
							System.out.println(person.getPlayerName() + ", this is your hand.");
							if (person.getPlayerHand()==1)
							{
								Deck.displayPlayerOneHand();
							}
							if (person.getPlayerHand()==2)
							{
								Deck.displayPlayerTwoHand();
							}
							if (person.getPlayerHand()==3)
							{
								Deck.displayPlayerThreeHand();
							}
							if (person.getPlayerHand()==4)
							{
								Deck.displayPlayerFourHand();
							}
							playerBid(4);
							System.out.println();
							}
					}
			}
		}
		
		public static int playerBid(int a)
		{
			System.out.println("You must bid higher than any other bids on this hand.");
			System.out.println("Bids must also be between 15 and 24, inclusive. Type 0 to pass.");
			System.out.println("What would you like to bid?");
			Scanner inputBid = new Scanner (System.in);
			playerBid = inputBid.nextInt();
			if (playerBid==0)
			{
				return 0;
			}
			if (playerBid<=bid || playerBid>24)
				{
					playerBid(a);
				}
			bid = playerBid;
			bidder = a;
			System.out.println();
			System.out.println();
			lead = bidder;
			return bid;
		}
		
		public static void playHand()
		{
			for (int i = 0; i<12; i++)
			{
				System.out.println();
				playTrick();
				cardsInTrick.clear();
				System.out.println();
			}
			System.out.println("Team 1: " + teamOneScore);
			System.out.println("Team 2: " + teamTwoScore);
			for (Player person : Introduction.playerList)
			{
				if (person.getPlayerHand()==1)
				{
					person.setPlayerHand(4);
				}
				else if (person.getPlayerHand()==2)
				{
					person.setPlayerHand(1);
				}
				else if (person.getPlayerHand()==3)
				{
					person.setPlayerHand(2);
				}
				else if (person.getPlayerHand()==4)
				{
					person.setPlayerHand(3);
				}
			}
		}
		
		public static void playTrick()
		{
			System.out.println();
			leadCard();
			System.out.println();
			playCard();
			System.out.println();
			playCard();
			System.out.println();
			playCard();
			System.out.println();
			scoreTrick();
			System.out.println();
		}

		public static void leadCard ()
		{
			turn = lead;
			for (Player leader : Introduction.playerList)
			{
				if (leader.getPlayerHand() == lead)
				{
					System.out.println(leader.getPlayerName() + ", it is your lead.");
					System.out.println("These are the cards you have in your hand.");
					if (leader.getPlayerHand()==1)
					{
						Deck.displayPlayerOneHand();
					}
					if (leader.getPlayerHand()==2)
					{
						Deck.displayPlayerTwoHand();
					}
					if (leader.getPlayerHand()==3)
					{
						Deck.displayPlayerThreeHand();
					}
					if (leader.getPlayerHand()==4)
					{
						Deck.displayPlayerFourHand();
					}
					System.out.println();
					System.out.println("What would you like to lead?");
					Scanner userInput = new Scanner(System.in);
					int cardPlayed = userInput.nextInt();
					
					if (leader.getPlayerHand()==1)
					{
						if (cardPlayed>Deck.playerOneHand.size())
						{
							leadCard();
						}
						suitLed = Deck.playerOneHand.get(cardPlayed-1).getSuit();
						trump.add(Deck.playerOneHand.get(cardPlayed-1));
						cardsInTrick.add(Deck.playerOneHand.get(cardPlayed-1));
						Deck.playerOneHand.remove(cardPlayed-1);
					}
					if (leader.getPlayerHand()==2)
					{
						if (cardPlayed>Deck.playerTwoHand.size())
						{
							leadCard();
						}
						suitLed = Deck.playerTwoHand.get(cardPlayed-1).getSuit();
						trump.add(Deck.playerTwoHand.get(cardPlayed-1));
						cardsInTrick.add(Deck.playerTwoHand.get(cardPlayed-1));
						Deck.playerTwoHand.remove(cardPlayed-1);
					}
					if (leader.getPlayerHand()==3)
					{
						if (cardPlayed>Deck.playerThreeHand.size())
						{
							leadCard();
						}
						suitLed = Deck.playerThreeHand.get(cardPlayed-1).getSuit();
						trump.add(Deck.playerThreeHand.get(cardPlayed-1));
						cardsInTrick.add(Deck.playerThreeHand.get(cardPlayed-1));
						Deck.playerThreeHand.remove(cardPlayed-1);
					}
					if (leader.getPlayerHand()==4)
					{
						if (cardPlayed>Deck.playerFourHand.size())
						{
							leadCard();
						}
						suitLed = Deck.playerFourHand.get(cardPlayed-1).getSuit();
						trump.add(Deck.playerFourHand.get(cardPlayed-1));
						cardsInTrick.add(Deck.playerFourHand.get(cardPlayed-1));
						Deck.playerFourHand.remove(cardPlayed-1);
					}
				}
			}
		}
			
		public static void playCard()
				{
					System.out.println("The following cards have been played on this trick so far:");
					for (Card trick : cardsInTrick)
					{
						System.out.println(trick.getRank() + "/" + trick.getSuit());
					}
					
					
					for (Player person : Introduction.playerList)
					{
						if (person.getPlayerHand() == turn+1 || (turn==4 && person.getPlayerHand()==1))
						{
						System.out.println(person.getPlayerName() + ", it is your turn. These are the cards you have in your hand.");
						if (person.getPlayerHand()==1)
						{
							Deck.displayPlayerOneHand();
						}
						else if (person.getPlayerHand()==2)
						{
							Deck.displayPlayerTwoHand();
						}
						else if (person.getPlayerHand()==3)
						{
							Deck.displayPlayerThreeHand();
						}
						else if (person.getPlayerHand()==4)
						{
							Deck.displayPlayerFourHand();
						}
						System.out.println();
						System.out.println("What would you like to play?");
						Scanner userInput = new Scanner(System.in);
						int cardPlayed = userInput.nextInt();
						
							if (person.getPlayerHand()==1)
							{
								if (cardPlayed>Deck.playerOneHand.size())
								{
									playCard();
								}
							}
							else if (person.getPlayerHand()==2)
							{
								if (cardPlayed>Deck.playerTwoHand.size())
								{
									playCard();
								}
							}
							else if (person.getPlayerHand()==3)
							{
								if (cardPlayed>Deck.playerThreeHand.size())
								{
									playCard();
								}
							}
							else if (person.getPlayerHand()==4)
							{
								if (cardPlayed>Deck.playerFourHand.size())
								{
									playCard();
								}
							}
							
							
						if (person.getPlayerHand()==1)
						{
							int counter = 0;
							if (Deck.playerOneHand.get(cardPlayed-1).getSuit() != suitLed)
							{
								for (Card play : Deck.playerOneHand)
								{
									if (play.getSuit() == suitLed)
									{
										counter++;
									}
								}
								if (counter!=0)
								{
									System.out.println();
									System.out.println("You need to follow suit.");
									playCard();
									System.out.println();
								}
								else
								{
									System.out.println();
									cardsInTrick.add(Deck.playerTwoHand.get(cardPlayed-1));
									System.out.println("You just played the " + Deck.playerOneHand.get(cardPlayed-1).getRank() + "/" +Deck.playerOneHand.get(cardPlayed-1).getSuit());
									Deck.playerOneHand.remove(cardPlayed-1);
									System.out.println();
								}
							}
							else if (counter == 0 || (Deck.playerOneHand.get(cardPlayed-1).getSuit() == suitLed ))	
							{
								cardsInTrick.add(Deck.playerOneHand.get(cardPlayed-1));
								System.out.println("You just played the " + Deck.playerOneHand.get(cardPlayed-1).getRank() + "/" +Deck.playerOneHand.get(cardPlayed-1).getSuit());
								Deck.playerOneHand.remove(cardPlayed-1);
								System.out.println();
							}	
						}
							
							
							
						else if (person.getPlayerHand()==2)
						{
							int counter = 0;
							if (Deck.playerTwoHand.get(cardPlayed-1).getSuit() != suitLed)
							{
								for (Card play : Deck.playerTwoHand)
								{
									if (play.getSuit() == suitLed)
									{
										counter++;
									}
								}
								if (counter!=0)
								{
									System.out.println();
									System.out.println("You need to follow suit.");
									playCard();
									System.out.println();
								}
								else
								{
									System.out.println();
									cardsInTrick.add(Deck.playerTwoHand.get(cardPlayed-1));
									System.out.println("You just played the " + Deck.playerTwoHand.get(cardPlayed-1).getRank() + "/" +Deck.playerTwoHand.get(cardPlayed-1).getSuit());
									Deck.playerTwoHand.remove(cardPlayed-1);
									System.out.println();
								}
							}
							else if (counter == 0 || (Deck.playerTwoHand.get(cardPlayed-1).getSuit() == suitLed) )	
							{
								cardsInTrick.add(Deck.playerTwoHand.get(cardPlayed-1));
								System.out.println("You just played the " + Deck.playerTwoHand.get(cardPlayed-1).getRank() + "/" +Deck.playerTwoHand.get(cardPlayed-1).getSuit());
								Deck.playerTwoHand.remove(cardPlayed-1);
								System.out.println();
							}
						}
							
							
							
						else if (person.getPlayerHand()==3)
						{
							int counter = 0;
							if (Deck.playerThreeHand.get(cardPlayed-1).getSuit() != suitLed)
							{
								for (Card play : Deck.playerThreeHand)
								{
									if (play.getSuit() == suitLed)
									{
										counter++;
									}
								}
								if (counter!=0)
								{
									System.out.println();
									System.out.println("You need to follow suit.");
									playCard();
									System.out.println();
								}
								else
								{
									System.out.println();
									cardsInTrick.add(Deck.playerThreeHand.get(cardPlayed-1));
									System.out.println("You just played the " + Deck.playerThreeHand.get(cardPlayed-1).getRank() + "/" +Deck.playerThreeHand.get(cardPlayed-1).getSuit());
									Deck.playerThreeHand.remove(cardPlayed-1);
									System.out.println();
								}
							}
							else if (counter == 0 || (Deck.playerThreeHand.get(cardPlayed-1).getSuit() == suitLed) )	
							{
								cardsInTrick.add(Deck.playerThreeHand.get(cardPlayed-1));
								System.out.println("You just played the " + Deck.playerThreeHand.get(cardPlayed-1).getRank() + "/" +Deck.playerThreeHand.get(cardPlayed-1).getSuit());
								Deck.playerThreeHand.remove(cardPlayed-1);
								System.out.println();
							}
						}
							
							
							
						else if (person.getPlayerHand()==4)
						{
							int counter = 0;
							if (Deck.playerFourHand.get(cardPlayed-1).getSuit() != suitLed)
							{
								for (Card play : Deck.playerFourHand)
								{
									if (play.getSuit() == suitLed)
									{
										counter++;
									}
								}
								if (counter!=0)
								{
									System.out.println();
									System.out.println("You need to follow suit.");
									playCard();
									System.out.println();
								}
								else
								{
									System.out.println();
									cardsInTrick.add(Deck.playerFourHand.get(cardPlayed-1));
									System.out.println("You just played the " + Deck.playerFourHand.get(cardPlayed-1).getRank() + "/" +Deck.playerFourHand.get(cardPlayed-1).getSuit());
									Deck.playerFourHand.remove(cardPlayed-1);
									System.out.println();
								}
							}
							else if (counter == 0 || (Deck.playerFourHand.get(cardPlayed-1).getSuit() == suitLed) )	
							{
								cardsInTrick.add(Deck.playerFourHand.get(cardPlayed-1));
								System.out.println("You just played the " + Deck.playerFourHand.get(cardPlayed-1).getRank() + "/" +Deck.playerFourHand.get(cardPlayed-1).getSuit());
								Deck.playerFourHand.remove(cardPlayed-1);
								System.out.println();
							}
						}
						}
					}
					if(turn<4)
					{
						turn+=1;
					}
					else
					{
						turn=1;
					}
					
		}
			
		public static void scoreTrick()
		{
			int cardWinner = 0;
			for (int i = 1; i<4; i++)
			{
				if ((cardsInTrick.get(i).getSuit() == suitLed) && (cardsInTrick.get(i).getRank()>cardsInTrick.get(cardWinner).getRank()))
				{
					cardWinner = i;
				}
				else if (cardsInTrick.get(i).getSuit()==trump.get(0).getSuit())
				{
					if (cardsInTrick.get(cardWinner).getSuit()==trump.get(0).getSuit())
					{
						if (cardsInTrick.get(i).getRank()>cardsInTrick.get(cardWinner).getRank())
						{
							cardWinner = i;
						}
					}
					else if (cardsInTrick.get(cardWinner).getSuit()!=trump.get(0).getSuit())
					{
						cardWinner = i;
					}
				}
			}
			for (Player person : Introduction.playerList)
			{
				if (person.getPlayerHand()==(cardWinner + lead))
				{
					turn = person.getPlayerHand();
					System.out.println();
					System.out.println(person.getPlayerName() + " took the trick with the " +  cardsInTrick.get(cardWinner).getRank() + "/" + cardsInTrick.get(cardWinner).getSuit() + "." );
					System.out.println();
					if (person.getPlayerTeamNumber()==1)
					{
						for (Card playedCard : cardsInTrick)
						{
							teamOneScore+= playedCard.getPoints();
						}
						teamOneScore+=1;
					}
					if (person.getPlayerTeamNumber()==2)
					{
						for (Card playedCard : cardsInTrick)
						{
							teamTwoScore+= playedCard.getPoints();
						}
						teamTwoScore+=1;
					}
					lead = person.getPlayerHand();
				}
				else if (person.getPlayerHand()==4 && cardWinner+lead==4)
				{
					turn = person.getPlayerHand();
					System.out.println();
					System.out.println(person.getPlayerName() + " took the trick with the " +  cardsInTrick.get(cardWinner).getRank() + "/" + cardsInTrick.get(cardWinner).getSuit() + "." );
					System.out.println();
					if (person.getPlayerTeamNumber()==1)
					{
						for (Card playedCard : cardsInTrick)
						{
							teamOneScore+= playedCard.getPoints();
						}
						teamOneScore+=1;
					}
					if (person.getPlayerTeamNumber()==2)
					{
						for (Card playedCard : cardsInTrick)
						{
							teamTwoScore+= playedCard.getPoints();
						}
						teamTwoScore+=1;
					}
					lead = person.getPlayerHand();
				}
			}
	}
}

