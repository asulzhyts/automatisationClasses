package calc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App_calculator {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s;
        int first_number;
        int second_number;
        char plus_minus;
        int result = 0;
        while (!(s = reader.readLine()).equals("quit")) {
            first_number = Integer.parseInt(s);
            plus_minus = reader.readLine().charAt(0);
            second_number = Integer.parseInt(reader.readLine());
            if (plus_minus == '+') result = first_number + second_number;
            if (plus_minus == '-') result = first_number - second_number;
            System.out.println("Результат: " + result);
        }
    }
}
