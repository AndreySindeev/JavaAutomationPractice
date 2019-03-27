import java.util.Arrays;

public class FindMinimum {

    public static int ComputeLowest( int x, int y, int z, int w){

        int array[] = {x, y, z, w};
        Arrays.sort(array);
        int value = array[0];
        //System.out.println(value);
        return value;
    }


}
