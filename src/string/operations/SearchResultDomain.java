package string.operations;

public class SearchResultDomain {
    private final String url;
    public SearchResultDomain(String url) {
        this.url = url;
    }
    public String getUrl() {
        return url;
    }
    public String parseDomain() {
        String[] partsFirst = url.split("://");
        String[] partsSecond = partsFirst[1].split("/");
        return partsSecond[0];
    }
}

class SearchResultDomainTest {
    public static void main(String[] args) {
        // test.com
        System.out.println(new SearchResultDomain("https://test.com").parseDomain());

        // firebase.google.com
        System.out.println(new SearchResultDomain("http://firebase.google.com").parseDomain());
        // main.vercel.app
        System.out.println(new SearchResultDomain("https://main.vercel.app/?q=nearest").parseDomain());
    }
}
