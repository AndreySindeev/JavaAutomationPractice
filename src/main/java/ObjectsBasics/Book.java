package ObjectsBasics;

public class Book {

    String title;
    String author;
    double price;

    //Конструктор класса
    public Book()
    {   this.title = "100 лет одиночества";
        this.author = "Габриэль Гарсия Маркес";
        this.price = 12.2;
    }

    public Book(String title, String author, double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }


    public String getTitle() {

        return title;

    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }


    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    void printBookDetails(){
        System.out.println(getTitle());
        System.out.println(getAuthor());
        System.out.println(getPrice());
    }
}
