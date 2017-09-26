import java.util.ArrayList;

public class PlayerScoreCard {
    private ArrayList<Frame> frames;
    private int total;

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

    public String toString(){
        String s = "";

        for(int i = 0; i < this.getFrames().size(); i++){
            s += this.getFrame(i).toString();
        }

        return s;
    }
}
