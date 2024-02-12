package string.operations;

public class MathDetector {
    public boolean isMath(String text) {
        boolean result = false;
        int numbers = 0;
        boolean hasEquality = false;
        boolean hasMthSymbol = false;

        char[] symbols = text.toCharArray();
        for (char symbol : symbols) {
            if (symbol == '=') {
                hasEquality = true;
            } else if (symbol == '+' || symbol == '-' || symbol == '*' || symbol == '/') {
                hasMthSymbol = true;
            } else if (symbol >= '0' && symbol <= '9') {
                numbers ++;
            }
            if (hasEquality && hasMthSymbol && numbers >= 2) {
                result = true;
                break;
            }
        }
        return result;
    }
}

class MathDetectorTest {
    public static void main(String[] args) {
        //true
        System.out.println(new MathDetector().isMath("2+2=4"));

        //true
        System.out.println(new MathDetector().isMath("6+8=14"));

        //false
        System.out.println(new MathDetector().isMath("2004 is great year"));

        //false
        System.out.println(new MathDetector().isMath("Junior vs Middle"));

        //true
        System.out.println(new MathDetector().isMath("48+1=t"));

        //true
        System.out.println(new MathDetector().isMath("1*4=i"));
    }
}