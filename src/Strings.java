import java.text.NumberFormat;
import java.util.Arrays;

public class Strings {
    public static void main(String[] args) {
        String message = new String("Hello World");
        // shortcut
        String message1 = "Hello fellow";
        System.out.println(message1 + "humans");
        System.out.println(message1.startsWith("h"));
        System.out.println(message1.length());
        System.out.print(message1.indexOf("e"));
        // replace return a new string
        // all strings are inmutable, so they return a copy
        message1.replace("!", "*");
        String messageLowercase = message1.toLowerCase();
        message1.toUpperCase();
        messageLowercase.trim();
        // Special chars
        System.out.println("\"quotes\"");
        System.out.println("c:\\dd\\dd");
        System.out.println("\n\n");

        // arrays
        // arrays are fixed sized
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
        System.out.println(numbers); // returns memory address
        System.out.println(Arrays.toString(numbers)); // returns the actual elements

        // new array syntax
        int[] nums = { 2, 8, 4 };
        System.out.println(Arrays.toString(nums));

        // sort is inplace
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        // constants add final prefix, by convention is used UPPERCASE
        final float PI = 3.1416F;

        // arithmetic operator, +,-,*,/,%
        // division of two int is an int
        // to get a float or double we need two doubles/float
        // use casting
        double res = (double) 4 / (double) 4;

        // Implicit casting byte > short > int > long
        // no need to add casting here
        long result = 34 + 4; // default are integers

        // Cast Integer, Float, to String -> Use wrapper class
        System.out.println(Long.toString(result));

        String numStr = "2412";
        System.out.println(Integer.parseInt(numStr));

        // MATH CLASS
        Math.round(1.1F);
        Math.ceil(34.483);

        // CREATE RANDOM BETWEEN 1-100
        // (Math.random() * (high - low)) + low
        int myRand = (int) (Math.random() * 99) + 1;
        System.out.println(myRand);

        // FORMAT Nums
        // IS ABSTRACT cannot create instance
        // .NumberFormat currentcv = new NumberFormat();
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String currencyStr = currency.format(123456.891);
        System.out.println(currencyStr);

        String percentStr = NumberFormat.getPercentInstance().format(0.1);
        System.out.println(percentStr);

    }
}
