package Exceptions;

public class Task2 {

    public static void main(String[] args) {
        try {
            int testList[][] = {{1,2}, {3,4,5}, {6,7,8,9}, {}};

            for (int i = 0; i < 999999; i++)
                System.out.println(testList[i]);
        }

        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error: " + e.getMessage());
        }

        finally {

            try {
                throw new Exception();
            }
            catch (Exception error){
                System.out.println("FAIL! " + error.getMessage());
            }
            finally {
                System.out.println("FINALLY");
            }
        }
    }
}




