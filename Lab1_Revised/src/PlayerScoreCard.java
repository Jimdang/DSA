import java.util.ArrayList;

public class PlayerScoreCard {
    private ArrayList<Frame> frames;
    private int total;
    private int numberOfSpares;
    private int numberOfStrikes;

    public int getNumberOfStrikes() {
        this.numberOfStrikes = this.calculateNumberOfStrikes();
        return numberOfStrikes;
    }


    public PlayerScoreCard(){
        frames = new ArrayList<Frame>();
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public Frame getFrame(int whichFrame){
        return frames.get(whichFrame);
    }

    public void addFrame(Frame frame){
        frames.add(frame);
    }

    public ArrayList<Frame> getFrames(){
        return frames;
    }

    public int getNumberOfSpares(){
        this.numberOfSpares = this.calculateNumberOfSpares();
        return this.numberOfSpares;
    }

    private int calculateNumberOfSpares(){
        int numSpares = 0;

        for(Frame frame: frames){
            if(frame.isHasSpare()){
                numSpares++;
            }
        }

        return numSpares;
    }

    private int calculateNumberOfStrikes(){
        int numStrikes = 0;

        for(Frame frame: frames){
            if(frame.isHasStrike()){
                numStrikes++;
            }
        }

        return numStrikes;
    }

    public String toString(){
        String s = "";

        for(int i = 0; i < this.getFrames().size(); i++){
            s += this.getFrame(i).toString();
        }

        return s;
    }
}
