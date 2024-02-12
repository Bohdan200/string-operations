package string.operations;

public class NumberDetector {
    public boolean detect(String text) {
        boolean result = true;

        char[] symbols = text.toCharArray();
        for (char symbol: symbols) {
            if(symbol != ' ' && !Character.isDigit(symbol)) {
                result = false;
                break;
            }
        }
        return result;
    }
}

class NumberDetectorTest {
    public static void main(String[] args) {
        //true
        System.out.println(new NumberDetector().detect("23 50"));

        //false
        System.out.println(new NumberDetector().detect("Year 1990"));
    }
}