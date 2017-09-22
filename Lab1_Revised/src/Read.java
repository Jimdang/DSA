import java.io.*;
import java.util.Scanner;
/**
 * Class to read a given file 
 * @author James, Mohib
 *
 */
public class Read {

	private String a;
	private String b;
	private String c;
	private String d;
	private String e;
	private String f;
	private int g;
	private Scanner x;
	
	/**
	 * 1: Read the number players
	 * 2: Read all the frames and separate out to each player
	 * Constructor to initialize the fields
	 */
	public Read()
	{

	}
	

	
	public String getB()
	{
		return b;
	}
	
	public String getC()
	{
		return c;
	}
	
	public String getD()
	{
		return d;
	}
	
	public void openFile()
	{
		try{
			
			x = new Scanner(new File ("TestFile.txt"));
		}
		catch (Exception e){
			System.out.println("could not find file"); 
		}
	}
	

	
	public void readFirstLine()
	{
		try {
			g = Integer.parseInt(x.next());
			System.out.println(g);
			
		}
		catch (Exception e) {
			System.out.println("Invalid player number.");
		}

	}
	public void readFile(){
		for(int i = 0; i < 9; i++) {
			if(x.hasNext()){
				a = x.next();
				b = x.next();
				c = x.next();
				d = x.next();

				System.out.printf("%s %s %s %s  %n", a,b,c,d);

			}
		}

	}
	
	public void readLastLine() {
		while(x.hasNext()) {
			a = x.next();
			b = x.next();
			c = x.next();
			d = x.next();
			e = x.next();
			f = x.next();

			System.out.printf("%s %s %s %s %s %s %n", a,b,c,d,e,f); 			
			
		}

	}
	
	public void closeFile()
	{
		x.close(); 
	}
}
