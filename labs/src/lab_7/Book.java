package lab_7;

public class Book
{
    private String name;
    private int year;
    private String author;
    private String genre;

    public Book(String _name, int _year, String _author, String _genre){
        this.name = _name;
        this.year = _year;
        this.author = _author;
        this.genre = _genre;
    }

    public void print() {
        System.out.println("{ " + String.join(" | ", name, "" + year , author, genre) + " }");
    }

}
