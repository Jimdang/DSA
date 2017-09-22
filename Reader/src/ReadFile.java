import java.io.*; 
import java.util.Scanner;


public class ReadFile {

	private Scanner x; 
	public void openFile(){
		try{
			
			x = new Scanner(new File("chinese.txt"));
		}
		catch (Exception e){
			System.out.println("could not find file"); 
		}
	}
	public void readFirstLine(){
		if(x.hasNext()) {
			String a = x.next();
			if(a.equals("0") || a.equals("1") || a.equals("2") || a.equals("3")
					|| a.equals("4")|| a.equals("5") || a.equals("6")) {
				System.out.println(a);
			}
			else {
				System.out.println("Invalid player number");
			}
		}
	}
	
	public void readFile(){
		for(int i = 0; i < 9; i++) {
			if(x.hasNext()){
				String a = x.next();
				String b = x.next();
				String c = x.next();
				String d = x.next();

				System.out.printf("%s %s %s %s  %n", a,b,c,d);
					}
				}

			}
	
	public void readLastLine() {
		while(x.hasNext()) {
			String a = x.next();
			String b = x.next();
			String c = x.next();
			String d = x.next();
			String e = x.next();
			String f = x.next();

			System.out.printf("%s %s %s %s %s %s %n", a,b,c,d,e,f); 			
			
		}

	}
	
	public void closeFile(){
		
		x.close(); 
		
	}
}
