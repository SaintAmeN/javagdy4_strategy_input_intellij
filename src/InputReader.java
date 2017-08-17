public class InputReader {
    private IInputStrategy strategy;

    public int requestInt(){
        return strategy.getInt();
    }
    public String requestString(){
        return strategy.getString();
    }
    public double requestDouble(){
        return strategy.getDouble();
    }
}
