package string.operations;

public class EmailDetector {
    public boolean isPresent(String text) {
        int index = text.indexOf('@');

        if (index != -1) {
            return text.charAt(index - 1) != ' ' && text.charAt(index - 2) != ' ' && text.charAt(index + 1) != ' ' && text.charAt(index + 2) != ' ';
        } else {
            return false;
        }
    }
}

class EmailDetectorTest {
    public static void main(String[] args) {
        //true
        System.out.println(new EmailDetector().isPresent("This email is no-reply@gmail.com"));

        //false
        System.out.println(new EmailDetector().isPresent("No email present, but @ there"));

        //false
        System.out.println(new EmailDetector().isPresent("Hello ih my@g mail"));
    }
}