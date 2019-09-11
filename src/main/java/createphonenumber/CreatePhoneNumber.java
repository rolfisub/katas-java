package createphonenumber;

import java.util.Arrays;

public class CreatePhoneNumber {

    private static int[] numbers;

    public static String createPhoneNumber(int[] ns) {
        numbers = ns;
        String area = getSubArrayAsString(0, 3);
        String first3 = getSubArrayAsString(3, 6);
        String last4 = getSubArrayAsString(6, 10);
        return "(" + area + ") " + first3 + "-" + last4;
    }

    private static String getSubArrayAsString(int from, int to) {
        return concatNumbers(Arrays.copyOfRange(numbers, from, to));
    }

    private static String concatNumbers(int[] nums) {
        String result = "";
        for(int n: nums)
            result = result.concat(String.valueOf(n));
        return result;
    }
}
