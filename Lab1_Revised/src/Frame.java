public class Frame {
    private String scoreLine;
    private String rollOne;
    private String rollTwo;
    private int score;

    public Frame(){

    }

    public String getScoreLine() {
        return scoreLine;
    }

    public void setScoreLine(String scoreLine) {
        this.scoreLine = scoreLine;
    }

    public String getRollOne() {
        return rollOne;
    }

    public void setRollOne(String rollOne) {
        this.rollOne = rollOne;
    }

    public String getRollTwo() {
        return rollTwo;
    }

    public void setRollTwo(String rollTwo) {
        this.rollTwo = rollTwo;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void parseRolls(){
        String rolls[] = scoreLine.split(",");
        if(rolls.length > 2){
            //handle spare or strike on last frame
        }
        else{
            this.rollOne = rolls[0];
            this.rollTwo = rolls[1];
        }
    }

    public String toString(){
        String s = "";

        s += this.rollOne;
        s += " ";
        s += this.rollTwo;

        return s;
    }
}
