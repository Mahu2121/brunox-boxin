package edu.estatuas;

public class RegularRound {
    private final String roundScore;
    private byte redBoxerScore;
    private byte blueBoxerScore;


    RegularRound(String roundScore) {
        this.roundScore = roundScore.replaceAll("\\s", "");
        this.parseBoxerRoundScore();
    }

    String  getRoundScore() {
        return this.roundScore;
    }

    private void parseBoxerRoundScore(){
        String[] scores = getRoundScore().split("-", 2);
    }



    public byte getRedBoxerScore() {
        return this.redBoxerScore;
    }


    public byte getBlueBoxerScore() {
        return this.blueBoxerScore;
    }

    @Override
    public String toString() {
        return this.getRedBoxerScore() + " - " + this.getBlueBoxerScore();
    }


}
