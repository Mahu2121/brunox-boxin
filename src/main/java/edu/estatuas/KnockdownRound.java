package edu.estatuas;

public class KnockdownRound implements Round {
    private final String roundScore;
    private byte redBoxerScore;
    private byte blueBoxerScore;
    /* hacerlo igual que regular round con el parseByte */


    KnockdownRound(String roundScore) {

        this.roundScore = roundScore.replaceAll("\\s", "");
        this.parseBoxerRoundScore();
    }

    private void parseBoxerRoundScore(){
        String [] scores = getRoundScore().split("-",2);
        this.redBoxerScore = Byte.parseByte(scores[0]);
        this.blueBoxerScore = Byte.parseByte(scores[1]);

    }

    private String getRoundScore(){
        return roundScore;
    }

    public void boxerRoundScore(){

    }

    @Override
    public byte getRedBoxerScore() {
        return this.redBoxerScore;
    }

    @Override
    public byte getBlueBoxerScore() {
        return this.blueBoxerScore;
    }

    @Override
    public String toString() {
        return this.getRedBoxerScore() + " - " + this.getBlueBoxerScore();
    }
}
