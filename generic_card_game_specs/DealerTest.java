import static org.junit.Assert.*;
import org.junit.*;
import generic_card_game.*;
import generic_card_game.*;

public class DealerTest {

  //test variables here
  private Dealer dealer;
  private CardSuit suits;
  private CardNumber numbers;
  private Deck deck;
  private Player player;   

  @Before
  public void before(){
    dealer = new Dealer("Dealer", true, 17);
    deck = new Deck(suits, numbers);
    player = new Player("Bob", true, 17);
  }

  @Test
  public void canDealCardToPlayer(){
    dealer.dealCard(deck, player);
    assertEquals(1, player.numberOfCards());
    assertEquals(51, deck.numberOfCards());  
  }
}