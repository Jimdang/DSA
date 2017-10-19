import java.io.*;
import java.text.ParseException;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * Class to read a given file 
 * @author James, Mohib
 *
 */
public class Read {

	private ArrayList<String> playerScores = new ArrayList<String>();
	private ScoreBoard scoreBoard;
	private Scanner scanner;

	/**
	 * 1: Read the number players
	 * 2: Read all the frames and separate out to each player
	 * Constructor to initialize the fields
	 */
	public Read()
	{
	    scoreBoard = new ScoreBoard();

	    this.openFile();
        scoreBoard.setNumberOfPlayers(readFirstLine());
        for(int i = 0; i <= scoreBoard.getNumberOfPlayers(); i++){
            PlayerScoreCard scoreCard = new PlayerScoreCard();
            scoreBoard.addPlayer(scoreCard);
        }

        this.readFile();

	}
	
	public void openFile()
	{
		try{

            this.scanner = new Scanner(new File ("TestFile.txt"));
		}
		catch (Exception e){
			System.out.println("could not find file"); 
		}
	}

	public Integer readFirstLine()
	{
	    int numberOfPlayers = 0;

		try {
			numberOfPlayers = Integer.parseInt(scanner.nextLine());
			if (numberOfPlayers <= 0|| numberOfPlayers > 7){
			    System.out.println("Too many or too few players. Please keep players between 1 and 6.");
			    System.exit(0);
            }
		}
		catch (NumberFormatException  except) {
			System.out.println("Please enter a valid numeral.");
            System.exit(0);
		}

		return numberOfPlayers;
	}

	public void readFile(){
		for(int i = 0; i < 10 ; i++) {
			if(scanner.hasNext()){
                String scoreLine;
                scoreLine = scanner.nextLine();
                String scores[] = scoreLine.split("]");
                for(int x = 0; x < scores.length; x++){
                    PlayerScoreCard psc = scoreBoard.getPlayerScoreCard(x);
                    Frame frame = new Frame();
                    frame.setScoreLine(scores[x]);
                    frame.parseRolls();
                    psc.addFrame(frame);
                }
			}
		}

	}

	public void closeFile()
	{
		scanner.close();
	}

	public void print(){
	    scoreBoard.printScoreBoard();
    }
}
