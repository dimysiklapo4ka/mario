package InitDnepr.pset1.mario;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by d1mys1klapo4ka on 13.03.2017.
 */
public class Mario {

    public static void main(String[] args) throws IOException {

        System.out.print("Enter the number of steps : ");

        int stairs = Reader();
        TestingPositivValue(stairs);

    }

    static int Reader() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int stairs = Integer.parseInt(reader.readLine());
        reader.close();

        return stairs;
    }

    static void Treangle(int stairs) {

        int a = 2, b = 0;

        for (int i = 0; i < stairs; i++) {

            while (b < stairs - 1) {
                System.out.print(" ");
                b++;
            }

            b = i + 1;

            for (int j = 0; j < a; j++) {
                System.out.print("#");
            }
            a++;

            System.out.println();
        }
    }

    static void TestingPositivValue(int n) throws IOException {
        while (true) {
            if (n >= 0 && n <= 23) {
                Treangle(n);
                break;
            }
            System.out.print("Retry");
            n = Reader();
        }
    }
}

