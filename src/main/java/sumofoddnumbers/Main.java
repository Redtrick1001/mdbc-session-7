package sumofoddnumbers;

import java.util.Scanner;

public class Main {
    static void main() {
        try (Scanner scanner = new Scanner(System.in)){
            System.out.println("What row would you like the sum of");
            String rawRow = scanner.nextLine();
            int row = Integer.parseInt(rawRow);

            SumOfOddNumber runner = new SumOfOddNumber();
            System.out.println(runner.sumOfOddNumber(row));
        }
    }
}
