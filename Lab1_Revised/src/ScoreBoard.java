import java.util.ArrayList;

public class ScoreBoard {
    private int numberOfPlayers;
    private ArrayList<PlayerScoreCard> scores;

    public ScoreBoard(){
        scores = new ArrayList<PlayerScoreCard>();
    }

    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public void setNumberOfPlayers(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }

    public void addPlayer(PlayerScoreCard playerScoreCard){
        scores.add(playerScoreCard);
    }

    public PlayerScoreCard getPlayerScoreCard(int indexOfPlayer){
        return scores.get(indexOfPlayer);
    }

    public void printScoreBoard(){
        for(PlayerScoreCard psc: scores){
            System.out.println("Printing scorecard for player:");
            for(Frame frame: psc.getFrames()){
                System.out.println(frame.toString().trim());
            }
            System.out.println("Total number of Spares player: " + psc.getNumberOfSpares());
            System.out.println("Total number of Strikes player: " + psc.getNumberOfStrikes());
            System.out.println("Total score for player: " + psc.calculateTotalScore());
        }
    }

}
