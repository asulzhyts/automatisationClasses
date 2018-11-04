package reverse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App_reverse {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
// 1
        String s = "";
        char[] arr = line.toCharArray();
        for (int i = arr.length - 1; i >= 0; i--) {
            s += arr[i];
        }
// 2

        System.out.println(s);
        String[] arr2 = line.split(" ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
//3
        String s1 = "";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ' ') s1 += '*';
            else s1 += arr[i];
        }
        System.out.println(s1);
//        System.out.println(line.replace(' ', '*')); // второй вариант замены пробела на звездочку
//4
        System.out.println(line.toUpperCase());
//5
        System.out.println(line.substring(4,10));
    }


}