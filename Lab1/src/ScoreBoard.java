import java.io.*;
import java.util.ArrayList;
public class ScoreBoard {

	private ArrayList testNumbers = new ArrayList<>();
	private String file;
	private int playerNum;
	public ScoreBoard() {
		File f = new File("D:/DSA/Lab1/BowlingLogFile.txt");
		FileWriter fw = null;
		BufferedWriter bw = null;
	}
	
	public void write(byte[] w) {
		String lineTwo = "{6,3} , {5,5}";
		String lineThree = "{4,5} , {1,7}";
		String lineFour = "{2,1} , {10,0}";
		String lineFive = "{4,4} , {3,2}";
		String lineSix = "{5,0} , {6,2}";
		String liveSeven = "{2,2} , {4,2}";
		String lineEight = "{3,3} , {6,1}";
		String lineNine = "{5,1} , {2,8}";
		String lineTen = "{9,1} , {4,3}";
		String lineEleven = "{1,0}";
		try {
			
		}
	}
	
	public static void main(String[] args) {
		
	}
}
