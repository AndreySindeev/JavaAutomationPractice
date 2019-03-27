public class TextProgramm {
    static void getOccuringChar(String str, String findellement) {

        int count=0;
        int index =str.indexOf(findellement);

        while(index!=-1){
            ++count;
            index = str.indexOf(findellement, index+findellement.length());
        }

        System.out.println( "Количество вхождений данного символа: " + count);

    }
}
