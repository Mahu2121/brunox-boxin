package edu.estatuas;

import java.util.List;
import java.util.Optional;
import java.util.ArrayList;
import java.util.Collections;


public class ScoreCard {

    private final String color;
    private String redCorner = "";
    private String blueCorner = "";
    private String [] judgeScoreCard;
    private String roundsView;
    private byte BlueBoxerFinalScore;
    private byte RedBoxerFinalScore;

    private List<Round> rounds = new ArrayList<Round>();



    public ScoreCard(String color) {
        this.color = color;
    }

    public void setRedCorner(String boxerName){
        this.redCorner = boxerName;
    }

    public void setBlueCorner(String boxerName){
        this.blueCorner = boxerName;
    }

    public void setJudgeScoreCard(String[] judgeScoreCard) {
        this.judgeScoreCard = judgeScoreCard;
    }


    public byte getNumRounds() {
        return (byte) this.rounds.size();
    }

    private byte getRedBoxerFinalScore() {
        if (this.RedBoxerFinalScore == 0) {
            int totalScore = 0;
            for (Round round : rounds) {
            totalScore += round.getRedBoxerScore();
            }
            this.RedBoxerFinalScore = (byte) totalScore;
        }return this.RedBoxerFinalScore;
    }
    private byte getBlueBoxerFinalScore() {
        if (this.BlueBoxerFinalScore == 0) {
            int totalScore = 0;
            for (Round round : rounds) {
                totalScore += round.getBlueBoxerScore();
            }
            this.BlueBoxerFinalScore = (byte) totalScore;
        }return this.BlueBoxerFinalScore;
    }

    public void loadJudgeScoreCard(String[] judgeScoreCard) {
        setJudgeScoreCard(judgeScoreCard);
        for (String roundScore : this.judgeScoreCard) {
            Round round = RoundFactory.getRound(roundScore);
            if (roundScore != null){
                this.rounds.add(round);
            }
        }
    }

    public String viewRounds(){
        StringBuilder roundsView = new StringBuilder();

        roundsView.append("\n Round \t Score \t Round \t Score \t Round \n")
                .append("\n Score \t Total \t    \t Total \t Score \n");

        byte roundNum = 1;

        byte redBoxerScoreTotal = 0;
        byte blueBoxerScoreTotal = 0;

        for(Round round : this.rounds) {
            roundsView.append("\n\t")
                    .append(round.getRedBoxerScore())
                    .append("\t\s")
                    .append(redBoxerScoreTotal += round.getRedBoxerScore())
                    .append("\t\s\s")
                    .append(roundNum++)
                    .append("\t\s")
                    .append(blueBoxerScoreTotal += round.getBlueBoxerScore())
                    .append("\t\s")
                    .append(round.getBlueBoxerScore());
        }
        return roundsView.toString();
    }

    @Override
    public String toString() {
        return "\n\t\t\t   " + this.color
                + "\n\t\t" + this.blueCorner
                + "\t" + this.redCorner
                + "\n\t\t\t"
                + this.getNumRounds() + " rounds\n"
                + this.viewRounds()
                + "\n\t FINAL SCORE: "
                + this.getRedBoxerFinalScore()
                + " - "
                + this.getBlueBoxerFinalScore()
                + " FINAL SCORE";
    }




}
