package kyu6.converttocamelcase;

import java.util.Arrays;
import java.util.List;

public class ToCamelCase {
    public static String toCamelCase(String str) {
        if(str.length() == 0) return "";
        String[] words = getWordsAsArray(str);
        Boolean isFirstWordCaps = isWordCapitalized(words[0]);
        allWordsToLowerCase(words);
        capitalizeWords(words, !isFirstWordCaps);
        return joinWords(words);
    }

    private static String[] getWordsAsArray(String str) {
        String[] uParts = str.split("_");
        if(uParts.length > 1) {
            return uParts;
        }
        String[] dParts = str.split("-");
        if(dParts.length > 1){
            return dParts;
        }
        return new String[]{str};
    }

    private static Boolean isWordCapitalized(String word) {
        char[] letters = word.toCharArray();
        return Character.isUpperCase(letters[0]);
    }

    private static void allWordsToLowerCase(String[] words) {
        int index = 0;
        for(String word: words) {
            words[index] = word.toLowerCase();
            index++;
        }
    }

    private static void capitalizeWords(String[] words, Boolean skipFist) {
        int index = 0;
        for(String word: words) {
            if(index == 0 && skipFist) {
                index++;
                continue;
            }
            words[index] = capitalizeWord(word);
            index++;
        }
    }

    private static String capitalizeWord(String word) {
        return word.substring(0,1).toUpperCase() + word.substring(1);
    }

    private static String joinWords(String[] words) {
        List<String> stringList = Arrays.asList(words);
        return String.join("", stringList);
    }

}
