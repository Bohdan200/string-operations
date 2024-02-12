package string.builder;

public class WordDeleter {
    public String remove(String phrase, String[] words) {
        StringBuilder newStr = new StringBuilder();
        String[] parts = phrase.split(" ");
        for (String part: parts) {
            boolean hasAnalogy = false;
            for (String word: words) {
                if (word.equals(part)) {
                    hasAnalogy = true;
                    break;
                }
            }
            if(!hasAnalogy) newStr.append(part).append(" ");
        }
        return newStr.toString().trim();
    }
}

class WordDeleterTest {
    public static void main(String[] args) {
        WordDeleter wordDeleter = new WordDeleter();

        //Hello
        System.out.println(wordDeleter.remove("Hello Java", new String[] {"Java"}));

        //My name John
        System.out.println(wordDeleter.remove("My name is John", new String[] {"is"}));
    }
}