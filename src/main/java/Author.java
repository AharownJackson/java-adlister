public class Author {

    // PROPERTIES //
    private String name;
    private String birthdate;

    // CONSTRUCTORS //
    public Author () {

    }

    public Author(String name, String birthdate) {
        this.name = name;
        this.birthdate = birthdate;
    }

    // GETTERS / SETTERS //

    public String getName() {
        return name;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }
}
