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
