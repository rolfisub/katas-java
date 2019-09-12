package kyu7.digitalroot;

public class DRoot {
    public static int digital_root(int number)
    {
        String numberAsString = String.valueOf(number);
        if(numberAsString.length() > 1) {
            int total = 0;
            char[] eachChar = numberAsString.toCharArray();
            for(char x: eachChar) {
                total += Character.getNumericValue(x);
            }
            return DRoot.digital_root(total);
        } else {
            return number;
        }
    }
}
