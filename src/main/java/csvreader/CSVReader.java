package csvreader;

import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.Scanner;

public class CSVReader {
    public String[] convertFrom(String input) {
        return input.split(",");
    }

    public String[][] convertFromUserInput() {
        ArrayList<String[]> output = new ArrayList<>();
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                String rawLine = scanner.nextLine();
                output.add(this.convertFrom(rawLine));

                System.out.println("would you like to enter another line");
                String again = scanner.nextLine();
                if (again.equalsIgnoreCase("no")) break;
            }
        }
        return output.toArray(new String[0][]);
    }
}
