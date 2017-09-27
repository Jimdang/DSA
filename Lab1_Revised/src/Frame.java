import java.util.Arrays;

public class Frame {
    private String scoreLine;
    private boolean hasSpare;
    private boolean hasStrike;
    private String rollOne;
    private String rollTwo;
    private String rollThree;
    private String rollFour;
    private int score;

    public boolean isHasSpare() {
        return hasSpare;
    }

    public void setHasSpare(boolean hasSpare) {
        this.hasSpare = hasSpare;
    }

    public boolean isHasStrike() {
        return hasStrike;
    }

    public void setHasStrike(boolean hasStrike) {
        this.hasStrike = hasStrike;
    }

    public boolean isLastFrameAndStrikeOrSpare() {
        return isLastFrameAndStrikeOrSpare;
    }

    public void setLastFrameAndStrikeOrSpare(boolean lastFrameAndStrikeOrSpare) {
        isLastFrameAndStrikeOrSpare = lastFrameAndStrikeOrSpare;
    }

    private boolean isLastFrameAndStrikeOrSpare;

    public String getRollOne() {
        return rollOne;
    }

    public void setRollOne(String rollOne) {
        this.rollOne = rollOne;
    }

    public Frame(){
        this.scoreLine = "";
        this.rollOne = "";
        this.rollTwo = "";
        this.rollThree = "";
        this.rollFour = "";
        this.isLastFrameAndStrikeOrSpare = false;
        this.score = -1;
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
            rolls[i] = rolls[i].replace("[", "").trim();
            if(rolls[i].equals("/")){
                this.hasSpare = true;
            }
            else if(rolls[i].equals("X")){
                this.hasStrike = true;
            }
        }

        if(rolls.length > 2) {
            isLastFrameAndStrikeOrSpare = true;
            this.rollOne = rolls[0];
            this.rollTwo = rolls[1];
            if(rolls.length == 3){
                this.rollThree = rolls[2];
            }
            if(rolls.length == 4){
                this.rollFour = rolls[3];
            }
        }
        else {
            this.rollOne = rolls[0];
            this.rollTwo = rolls[1];
        }

        if(!this.rollOne.equals("/") && !this.rollOne.equals("X")){
            try{
                int rollOneScore = Integer.parseInt(this.rollOne);
                if(rollOneScore > 9 || rollOneScore < 0){
                    System.out.println("Error: improper value in frame detected! Zeroing score for frame.");
                    this.score = 0;
                    return;
                }
            }
            catch(Exception e){
                System.out.println("Error: improper value in frame detected! Zeroing score for frame.");
                this.score = 0;
                return;
            }
        }

        if(!this.rollTwo.equals("/") && !this.rollTwo.equals("X")){
            try{
                int rollTwoScore = Integer.parseInt(this.rollTwo);
                if(rollTwoScore > 9 || rollTwoScore < 0){
                    System.out.println("Error: improper value in frame detected! Zeroing score for frame.");
                    this.score = 0;
                    return;
                }
            }
            catch(Exception e) {
                System.out.println("Error: improper value in frame detected! Zeroing score for frame.");
                this.score = 0;
                return;
            }
        }


        if(!this.hasSpare && !this.hasStrike){
                this.score = Integer.parseInt(this.rollOne);
                this.score += Integer.parseInt(this.rollTwo);
        }
    }

    public int scoreForStrikeOrSpare(Frame nextFrame, Frame frameAfter){
        this.score = 10;
        String nextRoll = nextFrame.getRollOne();
        if(nextRoll.equals("X")){
            if(frameAfter != null) {
                String rollAfterNext = frameAfter.getRollOne();
                if(rollAfterNext.equals("X")){
                    this.score = 30;
                }
            }
            else {
                this.score += nextFrame.scoreForStrikeOrSpare(frameAfter, null);
            }
        }
        else {
            this.score += Integer.parseInt(nextRoll);
        }

        return this.score;
    }

    public int scoreLastFrame(){
        this.score = 10;

        if(this.rollThree.equals("X")){
            this.score += 10;
        }
        else {
            this.score += Integer.parseInt(this.rollThree);
        }

        return this.score;
    }

    public String toString(){
        String s = "";

        s += this.rollOne;
        s += " ";
        s += this.rollTwo;
        s += " ";
        s += this.rollThree;
        s += " ";
        s += this.rollFour;

        return s;
    }
}
