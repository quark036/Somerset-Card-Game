
public class GameRunner
	{
		public static void main(String[] args)
			{
				Introduction.introduce();
				Introduction.choosePartners();
				while (Hand.teamOneScore<66 && Hand.teamTwoScore<66)
				{
					Deck.getShuffledDeck();
					Deck.dealDeck();
					Hand.bid();
					Hand.playHand();
				}
				
			}
	
	}
