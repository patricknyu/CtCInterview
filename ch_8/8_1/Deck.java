import java.util.ArrayList;
import CtCILibrary.AssortedMethods;

public class Deck <T extends Card> {
	private ArrayList<T> cards;
	//This will show where our first undealt card is.
	private int dealtIndex = 0;

	public Deck()
	{
	}

	public void setDeckOfCards(ArrayList<T> deckOfCards)
	{
		cards = deckOfCards;
	}

	public 
