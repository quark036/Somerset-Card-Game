import java.util.Comparator;

public class HandSorter implements Comparator<Card>{

	public int compare (Card g1 , Card g2)
	{
		 if (g1.getSuit()>g2.getSuit())
			 {
			 	return -1;
			 }
		 else if (g1.getSuit()==g2.getSuit())
			 {
			 	if (g1.getRank()>g2.getRank())
			 	{
			 		return -1;
			 	}
			 	else
			 	{
			 		return 1;
			 	}
			 }
		 else
		 {
			 return 1;
		 }
	}
}
