package date;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class week {
    public static void main(String[] args) throws IOException {
        String[] s1 = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        int i = Integer.parseInt(line);
        System.out.println(s1[i-1]);
    }
}
