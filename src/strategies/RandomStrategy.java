package strategies;

import java.util.Random;
import java.util.UUID;

/**
 * Created by amen on 8/17/17.
 */
public class RandomStrategy implements IInputStrategy {
    private Random random = new Random();

    @Override
    public int getInt() {
        return random.nextInt();
    }

    @Override
    public String getString() {
//        StringBuilder stringBuilder = new StringBuilder();
//        int ileZnakowWylosowac = random.nextInt(100);
//        for (int i = 0; i < ileZnakowWylosowac; i++) {
//            int rodzajZnaku = random.nextInt(3);
//            int znak;
//            if (rodzajZnaku == 0) { // losuj cyfre
//                znak = random.nextInt(10) + 48;
//            } else if (rodzajZnaku == 1) {
//                znak = random.nextInt(25) + 65;
//            } else {
//                znak = random.nextInt(25) + 97;
//            }
//            stringBuilder.append((char) znak);
//        }
//        return stringBuilder.toString();
        return UUID.randomUUID().toString();
    }

    @Override
    public double getDouble() {
        return random.nextDouble();
    }
}
