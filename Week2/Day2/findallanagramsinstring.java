import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class FindAllAnagramsInAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String p = sc.nextLine();

        ArrayList<Integer> result = new ArrayList<>();

        if (p.length() > s.length()) {
            System.out.println(result);
            return;
        }

        int[] a = new int[26];
        int[] b = new int[26];

        for (int i = 0; i < p.length(); i++) {
            a[p.charAt(i) - 'a']++;
            b[s.charAt(i) - 'a']++;
        }

        for (int i = p.length(); i < s.length(); i++) {
            if (Arrays.equals(a, b)) {
                result.add(i - p.length());
            }

            b[s.charAt(i) - 'a']++;
            b[s.charAt(i - p.length()) - 'a']--;
        }

        if (Arrays.equals(a, b)) {
            result.add(s.length() - p.length());
        }

        System.out.println(result);
    }
}
