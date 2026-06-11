import java.util.ArrayList;
import java.util.Scanner;

public class GenerateParentheses {

    static ArrayList<String> result = new ArrayList<>();

    static void generate(String str, int open, int close, int n) {
        if (str.length() == 2 * n) {
            result.add(str);
            return;
        }

        if (open < n) {
            generate(str + "(", open + 1, close, n);
        }

        if (close < open) {
            generate(str + ")", open, close + 1, n);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        generate("", 0, 0, n);

        System.out.println(result);
    }
}
