package string.builder;

public class UniqueCharCounter {
    public int count(String phrase) {
        int unique = 0;
        StringBuilder repeatSymbols = new StringBuilder();

        char[] symbolsArray = (phrase.toLowerCase()).toCharArray();
        for (char symbol: symbolsArray) {
            if(symbol == ' ') continue;
            int index = repeatSymbols.toString().indexOf(symbol);
            if(index == -1) {
                repeatSymbols.append(symbol);
                unique ++;
            }
        }
        return unique;
    }
}

class UniqueCharCounterTest {
    public static void main(String[] args) {
        UniqueCharCounter charCounter = new UniqueCharCounter();

        //3
        System.out.println(charCounter.count("123"));

        //4
        System.out.println(charCounter.count("ab100"));

        //3
        System.out.println(charCounter.count("Java"));
    }
}