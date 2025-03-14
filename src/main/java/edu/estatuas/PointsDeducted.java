package edu.estatuas;

public class PointsDeducted implements Round{
    private final String roundScore;
    private byte redBoxerScore;
    private byte blueBoxerScore;

        /* hecerlo igual que regular round con el parseByte pero divideiendolo en dos metodos:

            - uno que divida la puntuacion para asignar si es del boxeador rojo o de azul

               -Dos metodos nuevos que parseen por la coma en 8 y 1 y que coja el 8 (parseRed, parseBlue)
         */
    PointsDeducted(String roundScore) {
        this.roundScore = roundScore.replaceAll("\\s", "");
        this.parseBoxerRoundScore();
        }

    private void parseBoxerRoundScore() {
    String[] scores = roundScore.split("-",2);
    String redScore = scores[0];
    String blueScore = scores[1];
    this.redBoxerScore = Byte.parseByte(parseRedBoxerScore(redScore));
    this.blueBoxerScore = Byte.parseByte(parseBlueBoxerScore(blueScore));
    }

    private void parseRedBoxerScore(String redScore) {
    String redScore = getRedBoxerScore()+"";
    String[] points = redScore.split(",",2);
    this.redBoxerScore = Byte.parseByte(points[0]);}

    private void parseBlueBoxerScore(String blueScore) {
    String blueScore = getBlueBoxerScore()+"";
    String[] scores = blueScore.split(",",2);
    this.redBoxerScore = Byte.parseByte(scores[0]);}


    public void boxerRoundScore() {
    }

    @Override
    public byte getRedBoxerScore(){
      return this.redBoxerScore;
    }

    @Override
    public byte getBlueBoxerScore() {
        return this.blueBoxerScore;
    }

}
