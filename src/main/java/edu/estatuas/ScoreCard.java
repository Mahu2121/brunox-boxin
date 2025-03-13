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


    public byte getNumRounds() {
        return (byte) this.rounds.size();
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
                + this.viewRounds();
    }




}
