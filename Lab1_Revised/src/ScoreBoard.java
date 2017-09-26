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
            for(Frame frame: psc.getFrames()){
                System.out.println(frame.toString());
            }
        }
    }
}
