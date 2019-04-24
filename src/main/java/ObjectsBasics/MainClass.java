package ObjectsBasics;

public class MainClass {

    public static void main(String[] args) {

      Author author = new Author();
      author.namePrint();

      Author author1 = new Author("Барт", "Симпсон");
      author1.namePrint();

//
//      Book book = new Book();
//      book.printBookDetails();
//
        Book book = new Book("Горе от ума", "Грибоедов", 22.3);
        book.printBookDetails();

        Book book1 = new Book();
        book1.printBookDetails();

    }




}
