package Collections;

public class Task3 {

    public static void main(String args[]) {

        MyLinkedList<Integer> list = new MyLinkedList<>();

        for (int i = 1; i <= 10; i++)
            list.add(i);

        System.out.println("List:");
        list.printAll();

        System.out.println("\nRemove element:");
        list.remove(5);
        list.printAll();

        System.out.println("\nReversed List:");
        list.revese();
        list.printAll();


    }


}
