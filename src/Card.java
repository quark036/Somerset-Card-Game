
public class Card
	{
		private int suit;
		private int rank;
		private boolean isDouble;
		private int points;
		
		public Card(int s, int r, boolean ID, int p)
		{
			suit=s;
			rank = r;
			isDouble = ID;
			points = p;
			
		}

		public int getSuit()
			{
				return suit;
			}

		public void setSuit(int suit)
			{
				this.suit = suit;
			}

		public int getRank()
			{
				return rank;
			}

		public void setRank(int rank)
			{
				this.rank = rank;
			}

		public boolean isDouble()
			{
				return isDouble;
			}

		public void setDouble(boolean isDouble)
			{
				this.isDouble = isDouble;
			}

		public int getPoints()
			{
				return points;
			}

		public void setPoints(int points)
			{
				this.points = points;
			}
	}

