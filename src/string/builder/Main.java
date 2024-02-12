package string.builder;

public class Main {
    public static void main(String[] args) {
        //Hello
        WordDeleter wordDeleter = new WordDeleter();
        System.out.println(wordDeleter.remove("Hello Java", new String[] {"Java"}));
        //4
        UniqueCharCounter charCounter = new UniqueCharCounter();
        System.out.println(charCounter.count("ab100"));
        //Hello World
        DoubleSpaceCleaner cleaner = new DoubleSpaceCleaner();
        System.out.println(cleaner.clean("       Hello              World          "));
        //true
        System.out.println(new PalindromeDetector().isPalindrome("Noon"));
        //life IS great thing
        String[] words = {"Life", "is", "great", "thing"};
        System.out.println(new PhraseMaker().join(words));
    }
}
