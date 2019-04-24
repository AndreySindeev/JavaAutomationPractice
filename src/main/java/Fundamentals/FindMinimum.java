package Fundamentals;

import java.util.Arrays;

public class FindMinimum {

    public static int ComputeLowest( int x, int y, int z, int w){

        int array[] = {x, y, z, w};
        Arrays.sort(array);
        int value = array[0];
        System.out.println("Минимальное значение " + value);
        return value;

    }
    /**Overload ComputeLowest method to:
     * 2 integer agr
     * 3 integer arg
     * Note: ComputeLowest(a, b, c, d) should use ComputeLowest(a, b, c) 
     *       ComputeLowest(a, b, c) should use ComputeLowest(a, b) */

}
