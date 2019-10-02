package kyu6.lengthmissingarray;

import java.util.ArrayList;
import java.util.Arrays;

public class LengthMissingArray {

    public static int getLengthOfMissingArray(Object[][] arrayOfArrays)
    {
        if(arrayOfArrays == null) return 0;
        if(arrayOfArrays.length == 0) return 0;
        ArrayList<Integer> lengths = new ArrayList<>(arrayOfArrays.length);

        boolean hasFoundNullItem = false;

        for(Object[] oArray: arrayOfArrays) {
            if(oArray == null ) {
                hasFoundNullItem = true;
            } else {
                lengths.add(oArray.length);
            }
        }

        if(hasFoundNullItem) return 0;

        Object[] oLengths = lengths.toArray();

        Arrays.sort(oLengths);

        int missingOne = 0;
        int counter = (int)oLengths[0];

        if (counter == 0) return 0;

        for(Object l: oLengths) {
            int casted = (int)l;
            if(counter != casted) {
                missingOne = counter;
                break;
            }
            counter++;
        }

        return missingOne;
    }
}
