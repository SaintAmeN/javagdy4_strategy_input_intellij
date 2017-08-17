package strategies;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by amen on 8/17/17.
 */
public class FileStrategy implements IInputStrategy {
    Scanner sc;

    public FileStrategy() {
        try {
            sc = new Scanner(new File("input.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public int getInt() {
        return sc.nextInt();
    }

    @Override
    public String getString() {
        return sc.next();
    }

    @Override
    public double getDouble() {
        return sc.nextDouble();
    }
}
