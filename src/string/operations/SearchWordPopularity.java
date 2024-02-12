package string.operations;

public class SearchWordPopularity {
    private final String word;
    private final int freq;
    public SearchWordPopularity(String word, int freq) {
        this.word = word;
        this.freq = freq;
    }
    public String getWord() {
        return word;
    }
    public int getFreq() {
        return freq;
    }
    @Override
    public String toString() {
        String popularity = "";
        if(freq < 1000) popularity += "LOW";
        if(freq >= 1000 && freq < 100000) popularity += "MEDIUM";
        if(freq >= 100000 && freq < 10000000) popularity += "HIGH";
        if(freq >= 10000000) popularity += "EXTRA HIGH";
        return "Word is [" + word + "], search freq is " + popularity;
    }
}

class SearchWordPopularityTest {
    public static void main(String[] args) {
        //Word is [hero], search freq is LOW
        System.out.println(new SearchWordPopularity("hero", 10));

        //Word is [science], search freq is MEDIUM
        System.out.println(new SearchWordPopularity("science", 10000));

        //Word is [love], search freq is HIGH
        System.out.println(new SearchWordPopularity("love", 9965499));

        //Word is [football], search freq is EXTRA HIGH
        System.out.println(new SearchWordPopularity("football", 564785654));
    }
}