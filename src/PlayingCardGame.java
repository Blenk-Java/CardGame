import java.security.PublicKey;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class PlayingCardGame {

    /*
    - Skapa en blandad kortlek som spelet ska använda sig av
- Kunna spela som en eller flera spelare (om spelet man valt att implementera spelas av flera spelare).
- Kunna vinna / förlora / få oavgjort i spelet. Med andra ord, man ska kunna spela ett kortspel.
- Innehålla en meny som ger användaren följande alternativ:
     */
    private PlayingCardDeck pcd = new PlayingCardDeck();

    public List<PlayingCard> shuffleDeck(){

       Collections.shuffle(pcd.getList());
       return pcd.getList();
    }

    public void startGame(){
        System.out.println("1: Spela ett parti");
        System.out.println("2: Visa spelregler");
        System.out.println("3: Avsluta spelet");
        Scanner sc = new Scanner(System.in);
        int userInput = sc.nextInt();

        switch(userInput){
            case 1:
                System.out.println("1 Spela ett parti");
                startHigherLower();
                break;
            case 2:
                System.out.println("2 Visa Spelregler");
                break;
            case 3:
                System.out.println("3 Avsluta spelet");
                break;
            default:
                System.out.println("Välj alternativ 1,2 eller 3.");


        }
    }

    public void startHigherLower(){
        shuffleDeck();
        boolean gameStatus = true;
        do {

            PlayingCard yourCard = pcd.getFirstCard();
            Scanner sc1 = new Scanner(System.in);
            PlayingCard computersCard;

            if (yourCard != null){
                computersCard = pcd.getFirstCard();
                System.out.println("Is " + yourCard + " Higher(H) or Lower(L) than computers card?");
                String userInput = sc1.nextLine();

                if (userInput.equals("H")){
                    if (yourCard.getValue() > computersCard.getValue()){
                        System.out.println("Correct, your card was higher");}
                }

                    else if (userInput.equals("L")){
                      if (yourCard.getValue() < computersCard.getValue()){
                         System.out.println("Correct, your card was lower"); }
                    }

                    else System.out.println("Sorry, you were incorrect");
                        gameStatus = false;
            }

             else {
                System.out.println("There are no more cards, you won!");
                 gameStatus = false;
             }

        } while (gameStatus = true);

        return;
    }

}
