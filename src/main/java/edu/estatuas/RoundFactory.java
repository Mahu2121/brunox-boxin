package edu.estatuas;

public class RoundFactory {

    public static Round getRound(String roundScore) {
        if (roundScore == null) {
            return null;
        }
        if (roundScore.equalsIgnoreCase("10 - 9")
                || roundScore.equalsIgnoreCase("9 - 10")) {
            return new RegularRound(roundScore);
        }

        if (roundScore.equalsIgnoreCase("10 - 8")
                || roundScore.equalsIgnoreCase("8 - 10")) {
            return new KnockdownRound(roundScore);
        }

        if (roundScore.equalsIgnoreCase("10 - 8 ,1")
                || roundScore.equalsIgnoreCase("1, 8 - 10")){
            return new PointsDeducted(roundScore);
        }
        return null;
    }


}
