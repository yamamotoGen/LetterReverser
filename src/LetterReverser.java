import java.util.Scanner;

public class LetterReverser {
    public String reverseString(String str) {
        if (str == null || str.isEmpty()) {
            return "";
        }

        StringBuilder stringBuilder = new StringBuilder();
        char[] chars = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            if (str.codePointAt(i) > 64 && str.codePointAt(i) < 91 || str.codePointAt(i) > 96 && str.codePointAt(i) < 123) {
                stringBuilder.append(str.charAt(i));
            } else if (str.codePointAt(i) > 1039 && str.codePointAt(i) < 1104 || str.codePointAt(i) == 1025 || str.codePointAt(i) == 1105) {
                stringBuilder.append(str.charAt(i));
            } else {
                chars[i] = str.charAt(i);
            }
        }

        stringBuilder.reverse();

        for (int i = 0; i < str.length(); i++) {
            if (chars[i] != '\u0000') {
                stringBuilder.insert(i, chars[i]);
            }
        }

        return stringBuilder.toString();
    }
}