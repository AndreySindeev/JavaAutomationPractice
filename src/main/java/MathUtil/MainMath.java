package MathUtil;

public class MainMath {

    public static void main(String[] args) {
        int integerTestCases[][] = {{1,8}, {3,4,5}, {6,7,11,9}};
        double doubleTestCases[][] = {{1.0,2.0}, {3.0,4.0,5.0}, {6.0,7.0,8.0,9.0}};

        final int borderInt = 4;
        final double borderDouble = 4;
        final int exponent = 2;


        for (int i = 0; i < integerTestCases.length; i++)
            System.out.println(String.format("Test case %d - min integer: %d", i, Math.Min(integerTestCases[i])));

        for (int i = 0; i < integerTestCases.length; i++)
            System.out.println(String.format("Test case %d - max integer: %d", i, Math.Max(integerTestCases[i])));

        for (int i = 0; i < integerTestCases.length; i++)
            System.out.println(String.format("Test case %d - next after %d in int array: %d", i, borderInt,Math.NextAfter(integerTestCases[i], borderInt)));

        System.out.println(String.format("4^2 = %d", Math.Pow(borderInt, exponent)));


        for (int i = 0; i < doubleTestCases.length; i++)
            System.out.println(String.format("Test case %d - min double: %.2f", i, Math.Min(doubleTestCases[i])));

        for (int i = 0; i < doubleTestCases.length; i++)
            System.out.println(String.format("Test case %d - max double: %.2f", i, Math.Max(doubleTestCases[i])));

        for (int i = 0; i < doubleTestCases.length; i++)
            System.out.println(String.format("Test case %d - next after %.2f in double array: %.2f", i, borderDouble,Math.NextAfter(doubleTestCases[i], borderDouble)));

        System.out.println(String.format("4^2 = %.2f", Math.Pow(borderDouble, exponent)));

    }
    }




