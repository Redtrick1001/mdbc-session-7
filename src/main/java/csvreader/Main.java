package csvreader;

import java.util.Arrays;

public class Main {
    static void main() {
        CSVReader runner = new CSVReader();

        String[][] output = runner.convertFromUserInput();
        for (String[] line: output) {
            System.out.println(Arrays.toString(line));
        }
    }
}
