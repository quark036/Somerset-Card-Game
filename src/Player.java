
public class Player
	{
		private String playerName;
		private int playerNumber;
		private int playerTeamNumber;
		private int playerHand;
		private boolean hasBid;
		private Player (String p,int pN, int pTN, int pH, boolean hB)
		{
			playerName = p;
			playerNumber = pN;
			playerTeamNumber = pTN;
			playerHand = pH;
			hasBid=hB;
		}
		
		public String getPlayerName()
			{
				return playerName;
			}
		public void setPlayerName(String playerName)
			{
				this.playerName = playerName;
			}
		public int getPlayerNumber()
			{
				return playerNumber;
			}
		public void setPlayerNumber(int playerNumber)
			{
				this.playerNumber = playerNumber;
			}
		public int getPlayerTeamNumber()
			{
				return playerTeamNumber;
			}
		public void setPlayerTeamNumber(int playerTeamNumber)
			{
				this.playerTeamNumber = playerTeamNumber;
			}
		public int getPlayerHand()
			{
				return playerHand;
			}
		public void setPlayerHand(int playerHand)
			{
				this.playerHand = playerHand;
			}
		public boolean isHasBid() {
			return hasBid;
		}
		public void setHasBid(boolean hasBid) {
			this.hasBid = hasBid;
		}
		
	}
