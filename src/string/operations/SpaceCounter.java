package string.operations;

public class SpaceCounter {
    public double count(String text) {
        int spaces = 0;
        char[] symbols = text.toCharArray();
        for (char symbol : symbols) {
            if (Character.isWhitespace(symbol)) {
                spaces++;
            }
        }
        return (double) spaces / symbols.length;
    }
}

class WaterCounterTest {
    public static void main(String[] args) {
        //0.16
        System.out.println(new SpaceCounter().count("What are your interests ?"));
        //0.0
        System.out.println(new SpaceCounter().count("NoSpaces"));
    }
}