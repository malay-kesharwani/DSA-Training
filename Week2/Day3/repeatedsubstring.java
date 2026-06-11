import java.util.Scanner;

public class RepeatedSubstringPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        String str = s + s;

        System.out.println(str.substring(1, str.length() - 1).contains(s));
    }
}
