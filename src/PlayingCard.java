public class PlayingCard {

    /*
    - Färg/svit. Dvs spader (♠), hjärter (♥), ruter (♦) och klöver (♣)
- Valör. Dvs ess, 2, 3, 4, 5, 6, 7, 8, 9, 10, knekt, dam, kung
- Indikerar om ett kort är vänt/dolt eller inte. Dvs, är färg/svit och valör synlig
     */

    private String color;
    private int value;
    private boolean cardState;

    public PlayingCard (String color, int value, boolean cardState){
        this.color = color;
        this.value = value;
        this.cardState = cardState;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public boolean isCardState() {
        return cardState;
    }

    public void setCardState(boolean cardState) {
        this.cardState = cardState;
    }

}
