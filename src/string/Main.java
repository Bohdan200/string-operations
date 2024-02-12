package string;

import string.builder.UniqueCharCounter;
import string.builder.WordDeleter;
import string.operations.MathDetector;
import string.operations.PunctuationMarkCounter;
import string.operations.SearchResultDomain;
import string.operations.SpaceCounter;

public class Main {
    public static void main(String[] args) {
        System.out.println("String operations!");
        //4
        UniqueCharCounter charCounter = new UniqueCharCounter();
        System.out.println(charCounter.count("ab100"));
        //My name John
        WordDeleter wordDeleter = new WordDeleter();
        System.out.println(wordDeleter.remove("My name is John", new String[] {"is"}));
        //0.16
        System.out.println(new SpaceCounter().count("What are your interests ?"));
        //true
        System.out.println(new MathDetector().isMath("2+2=4"));
        //3
        PunctuationMarkCounter counter = new PunctuationMarkCounter();
        System.out.println(counter.count("My interests: football, basketball, volleyball"));
        // main.vercel.app
        System.out.println(new SearchResultDomain("https://main.vercel.app/?q=nearest").parseDomain());
    }
}
