public class Quote {

    // PROPERTIES //
    protected String quote;
    protected String author;

    // CONSTRUCTORS //
    public Quote() {

    }

    public Quote(String quote, String author) {
        this.quote = quote;
        this.author = author;
    }

    // GETTERS / SETTERS //

    public String getQuote() {
        return quote;
    }

    public String getAuthor() {
        return author;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
