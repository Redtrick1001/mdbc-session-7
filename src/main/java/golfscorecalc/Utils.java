package golfscorecalc;

public class Utils {
    public static int arrayNumSum(int[] array) {
        int total = 0;
        for (int num: array) {
            total += num;
        }
        return total;
    }
}
