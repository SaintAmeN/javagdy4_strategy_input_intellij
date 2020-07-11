package strategies;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by amen on 8/17/17.
 */
public class FileStrategy implements IInputStrategy {

    private Scanner scanner;

    public FileStrategy() {
        try {
            scanner = new Scanner(new File("input.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public int getInt() {
        return scanner.nextInt();
    }

    @Override
    public String getString() {
        return scanner.next();
    }

    @Override
    public double getDouble() {
        return scanner.nextDouble();
    }
}
