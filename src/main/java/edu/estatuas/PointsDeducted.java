package edu.estatuas;

public class PointsDeducted implements Round{
    private final String roundScore;
    private byte redBoxerScore;
    private byte blueBoxerScore;
    private String redScore;
    private String blueScore;

        /* hecerlo igual que regular round con el parseByte pero divideiendolo en dos metodos:

            - uno que divida la puntuacion para asignar si es del boxeador rojo o de azul

               -Dos metodos nuevos que parseen por la coma en 8 y 1 y que coja el 8 (parseRed, parseBlue)
         */
    PointsDeducted(String roundScore) {
        this.roundScore = roundScore.replaceAll("\\s", "");
        this.parseRoundScore();
        this.parseBlueBoxerScore();
        this.parseRedBoxerScore();
        }

    private void parseRoundScore() {
        String[] scores = getRoundScore().split("-",2);
        this.redScore = scores[0];
        this.blueScore = scores[1];
    }

    private void parseRedBoxerScore() {
        String[] redPoint = this.redScore.split(",",2);
        if (redPoint.length == 2){
            this.redBoxerScore = Byte.parseByte(redPoint[1]);
        } else {
            this.redBoxerScore = Byte.parseByte(redPoint[0]);
        }
    }

    private void parseBlueBoxerScore() {
        String[] bluePoint = this.blueScore.split(",",2);
        if (bluePoint.length == 2 || bluePoint.length == 1) {
            this.blueBoxerScore = Byte.parseByte(bluePoint[0]);
        }
    }

    String getRoundScore() {
        return this.roundScore;
    }

    @Override
    public byte getRedBoxerScore(){
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
