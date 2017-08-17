package strategies;

import java.util.Random;

/**
 * Created by amen on 8/17/17.
 */
public class RandomStrategy implements IInputStrategy {
    @Override
    public int getInt() {
        return new Random().nextInt();
    }

    @Override
    public String getString() {
        Random r = new Random();
        int dlugosc = r.nextInt(20);
        StringBuilder b = new StringBuilder();

        for (int i = 0; i < dlugosc; i++) {
            b.append((char)(r.nextInt(32) + 97));
        }
        return b.toString();
    }

    @Override
    public double getDouble() {
        return new Random().nextDouble();
    }
}
