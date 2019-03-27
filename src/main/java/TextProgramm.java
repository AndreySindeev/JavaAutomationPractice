public class TextProgramm {
    public void getOccuringChar(String str, String findellement) {

        int count = 0;
        int index = str.indexOf(findellement);

        while(index != -1){
            ++count; /**in this case you also could use 'count++' (it is necessary to understand difference between +count and count++ */
            index = str.indexOf(findellement, index + findellement.length());
        }

        System.out.println( "Количество вхождений данного символа: " + count);

    }
}
