package edu.estatuas;

public class Round {
    private byte redBoxerScore;
    private byte blueBoxerScore;

    public Round(byte redScore, byte blueScore) {
        this.redBoxerScore = redScore;
        this.blueBoxerScore = blueScore;

    }

    public byte getRedBoxerScore() {
        return redBoxerScore;
    }

    public byte getBlueBoxerScore() {
        return blueBoxerScore;
    }
}
