package golfscorecalc;

public class Main {
    static void main() {
        int[] playerSore = {8, 3, 10, 1, 5, 7, 2, 9, 4, 6, 10, 1, 8, 3, 5, 7, 2, 9};
        int[] parForEachHole = {2, 6, 4, 9, 1, 7, 10, 3, 8, 5, 2, 6, 4, 9, 1, 7, 10, 3};

        GolfRound game = new GolfRound(playerSore, parForEachHole);

        System.out.println("Player score is: " + Utils.arrayNumSum(playerSore));
        System.out.println("Course par is: " + Utils.arrayNumSum(parForEachHole));
        System.out.println("Round Score is: " + game.getRoundScore());

    }
}
