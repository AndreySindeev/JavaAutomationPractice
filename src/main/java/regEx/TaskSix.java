package regEx;

public class TaskSix {

    void task6(){
        String[] testData = new String[]{"1223", "11223344", "1122333", "111111", "12e23"};

        String pattern = "(.)\\1";
        String result;

        for (String testCase : testData){
            result = testCase.replaceAll( pattern, "*");
            System.out.print(testCase + " - " + result + "\n");
        }
    }

}
