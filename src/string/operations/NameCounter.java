package string.operations;

public class NameCounter {
    public int count(String text) {
        int countNames = 0;
        String[] words = text.split(" ");
        for (String word: words) {
            if (Character.isUpperCase(word.charAt(0)) && Character.isLetter(word.charAt(1)) && Character.isLowerCase(word.charAt(1))) {
                countNames++;
            }
        }
        return countNames;

    }
}

class NameCounterTest {
    public static void main(String[] args) {
        //2
        System.out.println(new NameCounter().count("Hi Sydney"));

        //2
        System.out.println(new NameCounter().count("My name is Rock"));

        //0
        System.out.println(new NameCounter().count("HELLO BROTHER"));

        //0
        System.out.println(new NameCounter().count("NEW POST"));
    }
}