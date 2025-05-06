public class WordPair {
    private String first;
    private String second;

    public WordPair(String first, String second) {
        this.first = first;
        this.second = second;
    }

    public String getFirst() {
        return first;
    }

    public String getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return String.format("(\"%s\", \"%s\")", first, second);
    }
}