package strategies;

import java.util.Scanner;

/**
 * Created by amen on 8/17/17.
 */
public class StdInStrategy implements IInputStrategy {

    private Scanner scanner;

    public StdInStrategy() {
        scanner = new Scanner(System.in);
    }

    @Override
    public int getInt() {
        return scanner.nextInt();
    }

    @Override
    public String getString() {
        return scanner.nextLine();
    }

    @Override
    public double getDouble() {
        return scanner.nextDouble();
    }
}
