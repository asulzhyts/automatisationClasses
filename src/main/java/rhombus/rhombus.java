package rhombus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class rhombus {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        int rhombus_side = Integer.parseInt(line);
        for (int numberOfLine = 0; numberOfLine < (2 * rhombus_side - 1); numberOfLine++) {
            if (numberOfLine < rhombus_side) {
                for (int numberOfSymbol = 0; numberOfSymbol < (2 * rhombus_side - 1); numberOfSymbol++) {
                    if (numberOfSymbol + 1 == (rhombus_side - numberOfLine) || numberOfSymbol + 1 == (rhombus_side + numberOfLine)) System.out.print("*");
                    else System.out.print(" ");
                }
                System.out.println();
            } else {
                for (int numberOfSymbol = 0; numberOfSymbol < (2 * rhombus_side - 1); numberOfSymbol++) {
                    if (numberOfSymbol == (numberOfLine + 1 - rhombus_side) || numberOfSymbol == (3 * rhombus_side - numberOfLine - 3)) System.out.print("*");
                    else System.out.print(" ");
                }
                System.out.println();
            }
        }
    }
}