public class Album {

    // PROPERTIES //

    protected String artist;
    protected String name;
    protected int release_date;
    protected double sales;
    protected String genre;

    // CONSTRUCTORS //
    public Album () {

    }

    public Album(String artist, String name, int release_date, double sales, String genre) {
        this.artist = artist;
        this.name = name;
        this.release_date = release_date;
        this.sales = sales;
        this.genre = genre;
    }

    // GETTERS / SETTERS //

    public String getArtist() {
        return artist;
    }

    public String getName() {
        return name;
    }

    public int getRelease_date() {
        return release_date;
    }

    public double getSales() {
        return sales;
    }

    public String getGenre() {
        return genre;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRelease_date(int release_date) {
        this.release_date = release_date;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
