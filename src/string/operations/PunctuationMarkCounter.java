package string.operations;

public class PunctuationMarkCounter {
    public int count(String phrase) {
        int result = 0;
        char[] symbolsArray = phrase.toCharArray();
        for (char symbol: symbolsArray) {
            if(symbol == '.' || symbol == ',' || symbol == '!' || symbol == ':' || symbol == ';') {
                result++;
            }
        }
        return result;
    }
}

class PunctuationMarkCounterTest {
    public static void main(String[] args) {
        PunctuationMarkCounter counter = new PunctuationMarkCounter();
        //2
        System.out.println(counter.count("Hello, world!"));
        //3
        System.out.println(counter.count("My interests: football, basketball, volleyball"));
        //0
        System.out.println(counter.count("My name is Bob"));
        //1
        System.out.println(counter.count("End."));
    }
}