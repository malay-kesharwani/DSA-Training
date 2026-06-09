import java.util.Scanner;

public class PermutationInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        if (s1.length() > s2.length()) {
            System.out.println(false);
            return;
        }

        int[] a = new int[26];
        int[] b = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            a[s1.charAt(i) - 'a']++;
            b[s2.charAt(i) - 'a']++;
        }

        for (int i = s1.length(); i < s2.length(); i++) {
            if (java.util.Arrays.equals(a, b)) {
                System.out.println(true);
                return;
            }

            b[s2.charAt(i) - 'a']++;
            b[s2.charAt(i - s1.length()) - 'a']--;
        }

        System.out.println(java.util.Arrays.equals(a, b));
    }
}
