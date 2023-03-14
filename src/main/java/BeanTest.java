import java.util.ArrayList;
import java.util.List;

public class BeanTest {

    public static void main(String[] args) {

        Album album1 = new Album("The Joshua Tree", "U2", 1987, 16.7, "Rock" );
        Album album2 = new Album("Greatest Hits", "Queen", 1981, 20.6, "Rock");
        Album album3 = new Album("Spice", "Spice Girls", 1996, 16.4, "Pop");
        Author author1 = new Author("Amelia Earhart", "1897-07-24");
        Author author2 = new Author("Linus Torvalds", "1969-12-28");
        Author author3 = new Author("Hugh Glass", "1783-01-01");
        Quote quote1 = new Quote("Embrace your fear, it will carry you to a place where your courage is stored.", "Amelia Earhart" );
        Quote quote2 = new Quote("Bad programmers worry about the code. Good programmers worry about data structures and their relationships.", "Linus Torvalds");
        Quote quote3 = new Quote("Revenge is in God's hands, not mine.", "Hugh Glass");

        List<Quote> quotes = new ArrayList<>();
        quotes.add(quote1);
        quotes.add(quote2);
        quotes.add(quote3);

        for (Quote quote : quotes) {
            System.out.printf("""
                    %s  - %s
                    
                    """, quote.quote, quote.author);
        }

    }
}
