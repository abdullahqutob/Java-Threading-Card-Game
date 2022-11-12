import java.util.ArrayList;

public class Deck {

  ArrayList<Card> deck = new ArrayList<Card>();
  int Number;


  public Deck(int deckNumber){

      this.Number=deckNumber;
  }

    /**
     * @return first card from deck
     */
  public synchronized Card drawCard (){
      //TODO: add empty deck thread handling (wait)
      this.deck.remove(0);
      return this.deck.get(0);
  }

    /**
     * Inserts card into end of deck
     * @param card Card to be inserted
     */
    public void insertCard (Card card){
        this.deck.add(deck.size(), card);
    }

    public int getNumberofDeck() {
        return Number;
  }

    public int deckLength(){
        return this.deck.toArray().length;
    }

    public ArrayList<Card> getDeck() {
        return deck;
    }
}
