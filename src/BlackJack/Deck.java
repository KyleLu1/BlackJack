package BlackJack;

//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

import java.util.ArrayList;
import java.util.Collections;

public class Deck
{
	public static final int NUMFACES = 13;
	public static final int NUMSUITS = 4;
	public static final int NUMCARDS = 52;

	public static final String SUITS[] = {"CLUBS","SPADES","DIAMONDS","HEARTS"};

	private int topCardIndex;
	private ArrayList<Card> stackOfCards;

	public Deck ()
	{
		//initialize data - stackOfCards - topCardIndex
                stackOfCards = new ArrayList<>();
                topCardIndex = 51;
		
		//loop through suits
			//loop through faces
				//add in a new card
                for(int i = 0; i < NUMSUITS; i++){
                    for(int j = 0; j < NUMFACES; j++){
                        stackOfCards.add(new BlackJackCard(j + 1, SUITS[i]));
                    }
                }
		
	}

	//modifiers
        public void shuffle ()
	{
		//shuffle the deck
                Collections.shuffle(stackOfCards);
		//reset variables as needed
                topCardIndex = 51;
	}

   //accessors
	public int  size ()
	{
		return stackOfCards.size();
	}

	public int numCardsLeft()
	{
		return topCardIndex;
	}

	public Card nextCard()
	{
		return stackOfCards.get(topCardIndex--);
	}

	public String toString()
	{
		return stackOfCards + "   topCardIndex = " + topCardIndex;
	} 
}