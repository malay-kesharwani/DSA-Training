import java.util.Scanner;

public class RansomNote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String ransomNote = sc.nextLine();
        String magazine = sc.nextLine();

        int[] freq = new int[26];

        for (int i = 0; i < magazine.length(); i++) {
            freq[magazine.charAt(i) - 'a']++;
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            char ch = ransomNote.charAt(i);

            if (freq[ch - 'a'] == 0) {
                System.out.println(false);
                return;
            }

            freq[ch - 'a']--;
        }

        System.out.println(true);
    }
}
