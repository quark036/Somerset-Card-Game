import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck
	{
		static ArrayList <Card> deck = new ArrayList<Card>();
		static ArrayList <Card> pickup = new ArrayList<Card>();
		static ArrayList <Card> playerOneHand = new ArrayList<Card>();
		static ArrayList <Card> playerTwoHand = new ArrayList<Card>();
		static ArrayList <Card> playerThreeHand = new ArrayList<Card>();
		static ArrayList <Card> playerFourHand = new ArrayList<Card>();
		
		public static void getShuffledDeck()
		{
			deck.add(new Card(2, 0, false, 0));
			deck.add(new Card(2, 1,false, 1));
			deck.add(new Card(2, 2, true, 0));
			deck.add(new Card(4, 0, false, 0));
			deck.add(new Card(4, 1, false, 0));
			deck.add(new Card(4, 2, false, 1));
			deck.add(new Card(4, 3, false, 0));
			deck.add(new Card(4, 4, true, 0));
			deck.add(new Card(6, 0, false, 0));
			deck.add(new Card(6, 1, false, 0));
			deck.add(new Card(6, 2, false, 0));
			deck.add(new Card(6, 3, false, 1));
			deck.add(new Card(6, 4, false, 0));
			deck.add(new Card(6, 5, false, 0));
			deck.add(new Card(6, 6, false, 0 ));
			deck.add(new Card(8, 0, false, 0 ));
			deck.add(new Card(8, 1, false, 0 ));
			deck.add(new Card(8, 2, false, 0 ));
			deck.add(new Card(8, 3, false, 0 ));
			deck.add(new Card(8, 4, false, 2));
			deck.add(new Card(8, 5, false, 0 ));
			deck.add(new Card(8, 6, false, 0 ));
			deck.add(new Card(8, 7, false, 0 ));
			deck.add(new Card(8, 8, true, 0 ));
			deck.add(new Card(10, 0, false, 0 ));
			deck.add(new Card(10, 1, false, 0 ));
			deck.add(new Card(10, 2, false, 0 ));
			deck.add(new Card(10, 3, false, 0 ));
			deck.add(new Card(10, 4, false, 0 ));
			deck.add(new Card(10, 5, false, 2));
			deck.add(new Card(10, 6, false, 0 ));
			deck.add(new Card(10, 7, false, 0 ));
			deck.add(new Card(10, 8, false, 0 ));
			deck.add(new Card(10, 9, false, 0 ));
			deck.add(new Card(10, 10, true, 0 ));
			deck.add(new Card(12, 0, false, 0 ));
			deck.add(new Card(12, 1, false, 0 ));
			deck.add(new Card(12, 2, false, 0 ));
			deck.add(new Card(12, 3, false, 0 ));
			deck.add(new Card(12, 4, false, 0 ));
			deck.add(new Card(12, 5, false, 0 ));
			deck.add(new Card(12, 6, false, 2 ));
			deck.add(new Card(12, 7, false, 0 ));
			deck.add(new Card(12, 8, false, 0 ));
			deck.add(new Card(12, 9, false, 0 ));
			deck.add(new Card(12, 10, false, 0));
			deck.add(new Card(12, 11, false, 0));
			deck.add(new Card(12, 12, true, 0));
			Collections.shuffle(deck);
		}

		public static void dealDeck()
		{
			for (int i = 0; i<48; i++)
				{
					if (i%4 == 0)
						{
							playerOneHand.add(deck.get(i));
						}
					else if (i%4 == 1)
						{
							playerTwoHand.add(deck.get(i));
						}
					else if (i%4 == 2)
						{
							playerThreeHand.add(deck.get(i));
						}
					else if (i%4 == 3)
						{
							playerFourHand.add(deck.get(i));
						}
				}			
		}
		
		public static void sortHands()
		{
			Collections.sort(playerOneHand, new HandSorter());
			Collections.sort(playerTwoHand, new HandSorter());
			Collections.sort(playerThreeHand, new HandSorter());
			Collections.sort(playerFourHand, new HandSorter());
		}
		public static void displayPlayerOneHand ()
		{
			sortHands();
			for (int i = 0; i<playerOneHand.size(); i++)
			{
				System.out.println((i+1) + ") " + playerOneHand.get(i).getRank() + "/" + playerOneHand.get(i).getSuit());
			}
		}
		public static void displayPlayerTwoHand()
		{
			sortHands();
			for (int i = 0; i<playerTwoHand.size(); i++)
			{
				System.out.println((i+1) + ") " + playerTwoHand.get(i).getRank() + "/" + playerTwoHand.get(i).getSuit());
			}
		}
		public static void displayPlayerThreeHand()
		{
			sortHands();
			for (int i = 0; i<playerThreeHand.size(); i++)
			{
				System.out.println((i+1) + ") " + playerThreeHand.get(i).getRank() + "/" + playerThreeHand.get(i).getSuit());
			}
		}
		public static void displayPlayerFourHand()
		{
			sortHands();
			for (int i = 0; i<playerFourHand.size(); i++)
			{
				System.out.println((i+1) + ") " + playerFourHand.get(i).getRank() + "/" + playerFourHand.get(i).getSuit());
			}
		}
		public static ArrayList<Card> getDeck()
			{
				return deck;
			}

		public static void setDeck(ArrayList<Card> deck)
			{
				Deck.deck = deck;
			}

		public static ArrayList<Card> getPickup()
			{
				return pickup;
			}

		public static void setPickup(ArrayList<Card> pickup)
			{
				Deck.pickup = pickup;
			}

		public static ArrayList<Card> getPlayerOneHand()
			{
				return playerOneHand;
			}

		public static void setPlayerOneHand(ArrayList<Card> playerOneHand)
			{
				Deck.playerOneHand = playerOneHand;
			}

		public static ArrayList<Card> getPlayerTwoHand()
			{
				return playerTwoHand;
			}

		public static void setPlayerTwoHand(ArrayList<Card> playerTwoHand)
			{
				Deck.playerTwoHand = playerTwoHand;
			}

		public static ArrayList<Card> getPlayerThreeHand()
			{
				return playerThreeHand;
			}

		public static void setPlayerThreeHand(ArrayList<Card> playerThreeHand)
			{
				Deck.playerThreeHand = playerThreeHand;
			}

		public static ArrayList<Card> getPlayerFourHand()
			{
				return playerFourHand;
			}

		public static void setPlayerFourHand(ArrayList<Card> playerFourHand)
			{
				Deck.playerFourHand = playerFourHand;
			}

		
	}

