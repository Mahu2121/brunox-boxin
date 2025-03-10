package edu.estatuas;

public class RegularRound {
    private final String roundScore;
    private byte redBoxerScore;
    private byte blueBoxerScore;


    RegularRound(String roundScore) {
        this.roundScore = roundScore.replaceAll("\\s", "");
        this.parseBoxerRoundScore();
    }

}
