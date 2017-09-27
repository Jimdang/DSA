public class Frame {
    private String scoreLine;
    private char rollOne;
    private char rollTwo;
    private int score;

    public Frame(){

    }

    public String getScoreLine() {
        return scoreLine;
    }

    public void setScoreLine(String scoreLine) {
        this.scoreLine = scoreLine;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void parseRolls(){
        String rolls[] = scoreLine.split(",");
        for(int i = 0; i < rolls.length; i++){
            rolls[i] = rolls[i].replace("[", "");
        }
        if(rolls.length > 2){
            //handle spare o
        else{r strike on last frame
        }
            this.rollOne = rolls[0].toCharArray()[0];
            this.rollTwo = rolls[1].toCharArray()[0];
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
