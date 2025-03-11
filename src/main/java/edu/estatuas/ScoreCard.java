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

    private List<Round> rounds = new ArrayList<Round>();


    public void addRound(byte redScore, byte blueScore) {
        Round round = new Round(redScore, blueScore);
        rounds.add(round);
    }

    public ScoreCard(String color) {
        this.color = color;
    }

    public void setRedCorner(String boxerName){
        this.redCorner = boxerName;
    }

    public void setBlueCorner(String boxerName){
        this.blueCorner = boxerName;
    }






}
