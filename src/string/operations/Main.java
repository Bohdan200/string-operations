package string.operations;

public class Main {
    public static void main(String[] args) {
        //false
        EmailDetector emailDetector = new EmailDetector();
        System.out.println(emailDetector.isPresent("Hello ih my@g mail"));
        //true
        NumberDetector numberDetector = new NumberDetector();
        System.out.println(numberDetector.detect("23 50"));
        //3
        PunctuationMarkCounter counter = new PunctuationMarkCounter();
        System.out.println(counter.count("My interests: football, basketball, volleyball"));
        // main.vercel.app
        System.out.println(new SearchResultDomain("https://main.vercel.app/?q=nearest").parseDomain());
    }
}
