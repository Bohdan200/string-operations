package string.operations;

public class TextLettersCounter {
    public double count(String phrase) {
        int sumLetters = 0;
        String[] words = phrase.split(" ");
        for (String word : words) {
            sumLetters += word.length();
        }
        return (double) sumLetters / words.length;
    }
}
class TextLettersCounterTest {
    public static void main(String[] args) {
        //3.42...
        System.out.println(new TextLettersCounter().count("I invite you to dinner with us"));

        //5.0
        System.out.println(new TextLettersCounter().count("Life is beautiful thing"));
    }
}