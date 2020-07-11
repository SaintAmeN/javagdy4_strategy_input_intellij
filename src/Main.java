import strategies.FileStrategy;
import strategies.RandomStrategy;
import strategies.StdInStrategy;

import java.io.InputStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Witaj!");
        System.out.println("Podaj typ wejścia: (1-random, 2-stdin, 3-plik)");
        InputReader reader = new InputReader();



        Scanner sc = new Scanner(System.in);

        String type = sc.next();
        if (type.equals("1")) {
            reader.setStrategy(new RandomStrategy());
        } else if (type.equals("2")) {
            reader.setStrategy(new StdInStrategy());
        } else if (type.equals("3")) {
            reader.setStrategy(new FileStrategy());
        }


        while (sc.hasNextLine()) {
            String command = sc.next();
            if (command.equals("getint")) {
                System.out.println(reader.requestInt());
            } else if (command.equals("getstring")) {
                System.out.println(reader.requestString());
            } else if (command.equals("getdouble")) {
                System.out.println(reader.requestDouble());
            } else if (command.equals("setstrategy")) {
                type = sc.next();
                if (type.equals("random")) {
                    reader.setStrategy(new RandomStrategy());
                } else if (type.equals("stdin")) {
                    reader.setStrategy(new StdInStrategy());
                } else if (type.equals("file")) {
                    reader.setStrategy(new FileStrategy());
                }
            }
        }

    }
}
