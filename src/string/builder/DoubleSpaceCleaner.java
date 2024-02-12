package string.builder;

public class DoubleSpaceCleaner {
    public String clean(String phrase) {
        StringBuilder result = new StringBuilder();
        char[] symbolsArray = (phrase.trim()).toCharArray();
        for (int i = 0; i < symbolsArray.length; i++) {
            if (symbolsArray[i] != ' ') {
                result.append(symbolsArray[i]);
            } else if  (symbolsArray[i - 1] != ' ') {
                result.append(symbolsArray[i]);
            }
        }
        return result.toString();
    }
}

class DoubleSpaceCleanerTest {
    public static void main(String[] args) {
        DoubleSpaceCleaner cleaner = new DoubleSpaceCleaner();

        //Hello World
        System.out.println(cleaner.clean("Hello World"));

        //Hello World
        System.out.println(cleaner.clean("       Hello              World          "));
    }
}
