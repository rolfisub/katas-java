package findshort;

public class FShort {
    public static int findShort (String str) {
        String[] words = str.split(" ");
        if(words.length > 0) {
            int smallest = words[0].length();
            for(String word: words)
                smallest = word.length() < smallest ? word.length() : smallest;
            return smallest;
        }
        return 0;
    }
}
