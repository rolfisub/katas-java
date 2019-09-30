package kyu6.diamond;

public class Diamond {
    public static String print(int size) {
        int mod = size % 2;
        if (size < 1 || mod == 0) return null;
        if (size == 1) return "*\n";
        int lines = getLinesUp(size);
        int linesUp = lines;
        int spaces = 2 * linesUp;
        int ast = size - spaces;
        StringBuffer result = new StringBuffer();
        int countLinesUp = 0;
        while (countLinesUp < lines) {
            if(ast > 0) {
                result.append(getDiamonLine(spaces/2, ast));
            }
            linesUp--;
            spaces = 2 * linesUp;
            ast = size - spaces;
            countLinesUp++;
        }
        result.append(getDiamonLine(0, size));
        int countLinesDown = 1;
        spaces = 2;
        ast = size - 2;
        while(countLinesDown < lines) {
            result.append(getDiamonLine(spaces/2, ast));
            spaces += 2;
            ast = size - spaces;
            countLinesDown++;
        }
        return result.toString();
    }

    public static String getDiamonLine(int spaces, int ast) {
        StringBuffer result = new StringBuffer();
        result.append(getRepeatChars(' ', spaces));
        result.append(getRepeatChars('*', ast));
        result.append("\n");
        return result.toString();
    }

    public static int getLinesUp(int size) {
        int lines = 0;
        while(size >= 1) {
            size -= 2;
            lines++;
        }
        return lines;
    }

    public static String getRepeatChars(char c, int repeat) {
        String result = "";
        int count = 0;
        while (count < repeat) {
            result = result.concat(Character.toString(c));
            count++;
        }
        return result;
    }
}
