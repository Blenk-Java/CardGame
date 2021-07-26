import java.util.ArrayList;
import java.util.List;

public class PlayingCardDeck {

/*
- Minst en datastruktur för att lagra alla PlayingCard objekt. Tex Array, ArrayList, LinkedList, HashMap, etc.

- En metod som tar ut det översta/första kortet från PlayingCardDeck.
Implementera på valfritt sätt vad som ska hända om kortleken är tom och man anropar metoden (ska den returnera null / false? Ska den kasta ett exception? etc).

- En metod för att lägga till ett kort underst/längst bak på PlayingCardDeck.
 */

  private List<PlayingCard> playingCards;

    public PlayingCardDeck(){
        playingCards = new ArrayList<>();
        int amountCards = 52;
        int colors = 4;
        for (int i = 0; i < colors; i++){
            for (int j = 0; j < amountCards/colors; j++){
                if (i == 0){
                    playingCards.add(new PlayingCard("♠", j+1, false));
                } else if (i == 1){
                    playingCards.add(new PlayingCard("♥", j+1, false));
                } else if(i == 2){
                    playingCards.add(new PlayingCard("♦", j+1, false));
                } else
                    playingCards.add(new PlayingCard("♣", j+1, false));
            }
        }
    }

    public PlayingCard getPlayingCard(String color, int value){
    for (PlayingCard playingCard : playingCards){
        if (playingCard.getColor().equals(color) && playingCard.getValue() == value){
            return playingCard;
        }
    }
    return null;
    }

    public PlayingCard getFirstCard(){
        if (playingCards.get(0) != null) {
            PlayingCard card = playingCards.get(0);
            playingCards.remove(0);
            return card;
        }
        System.out.println("There are no more cards!");
        return null;
    }

    public List<PlayingCard> getList(){
        return playingCards;
    }

    public void addPlayingCardLast(PlayingCard card){
        playingCards.set(playingCards.size()-1, card);
    }

}
