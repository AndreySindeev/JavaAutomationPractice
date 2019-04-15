package ObjectsBasics;

public class Author {

    String firstName;
    String lastName;

    //Конструктор класса
    public Author(){
        this.firstName = "Гомер ";
        this.lastName = "Симпсон";
    }

    public Author(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }



    public void namePrint(){
        System.out.println(firstName + " " + lastName);
    }

}
