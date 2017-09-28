import java.util.ArrayList;
import java.util.Scanner;
public class Calculate {

	private Read r = new Read();
	private ArrayList<String> charArray;
	Scanner x;
	public Calculate()
	{
		this.charArray = new ArrayList<String>();
	}
	
	public int findPlayerSpares()
	{
		int sum = 0;
		for(int i = 0; i < charArray.size(); i++) {
			r.openFile();
			while(x.hasNext()) {
				charArray.add(x.toString());
				if(charArray.contains("/")) {
					sum += 1;
					return sum;
				}
			}
		}
		return -1;
	}
	
	/**
	public int numSpares()
	{
	for(int i = 0; i < 9; i++) {
	
		if(r.readFile().toString().contains("/")) {
			sum += 1;
		}
	}
	**/
}

