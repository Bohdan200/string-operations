package string.operations;

public class SearchQuery {
    private final String language;
    private final String text;
    public SearchQuery(String language, String text) {
        this.language = language;
        this.text = text;
    }

    @Override
    public String toString() {
        return "Searching [" + text + "], using language: " + language;
    }

    public String getLanguage() {
        return language;
    }
    public String getText() {
        return text;
    }
}

class GooQueryTest {
    public static void main(String[] args) {
        SearchQuery query = new SearchQuery("en", "capital");

        // en
        System.out.println("query.getLanguage() - " + query.getLanguage());
        // Capital
        System.out.println("query.getText() - " + query.getText().replace("c","C"));

        // Searching [capital], using language: en
        System.out.println(query);
    }
}
