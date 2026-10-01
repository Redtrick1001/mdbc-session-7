package golfscorecalc;

public class GolfRound {
    private final int[] holesPar;
    private final int[] playerScore;

    public GolfRound(int[] playerScore, int[] parForEachHole) {
        this.holesPar = parForEachHole;
        this.playerScore = playerScore;
    }

    public String getRoundScore() {
        int totalScore = Utils.arrayNumSum(this.playerScore);
        int coursePar = Utils.arrayNumSum(this.holesPar);
        int dif = totalScore - coursePar;

        String output = this.formatScore(totalScore, dif);
        return output;
    }


    public String formatScore(int score, int differenceFromPar) {
        return score +
                "(" +
                differenceFromPar +
                ")";
    }
}
