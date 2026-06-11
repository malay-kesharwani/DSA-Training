import java.util.Scanner;

public class ReverseWordsInAStringIII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String[] words = s.split(" ");

        StringBuilder result = new StringBuilder();

        for (String word : words) {
            result.append(new StringBuilder(word).reverse()).append(" ");
        }

        System.out.println(result.toString().trim());
    }
}
