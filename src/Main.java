import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        LetterReverser letterReverser = new LetterReverser();
        System.out.println(letterReverser.reverseString(str));
    }
}
