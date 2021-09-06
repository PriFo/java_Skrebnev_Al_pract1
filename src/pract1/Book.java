package pract1;

public class Book {
    private int year;
    private String name;
    private String author;
    public Book(int year, String name, String author) {
        this.year = year;
        this.name = name;
        this.author = author;
    }
    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }
    public Book(int year, String name) {
        this.year = year;
        this.name = name;
    }
    public Book(int year) {
        this.year = year;
    }
    public Book(String author) {
        this.author = author;
    }
    public Book() {
        this.year = 0;
        this.name = "Book";
        this.author = "Author";
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getInfo(){
        return("Name: "+this.name+"\nAuthor: "+this.author+"\nYear: "+this.year);
    }
}
