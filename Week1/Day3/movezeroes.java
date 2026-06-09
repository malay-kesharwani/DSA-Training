import java.util.Scanner;

public class MoveZeroes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int index = 0;

        for(int i = 0; i < n; i++) {
            if(nums[i] != 0) {
                nums[index] = nums[i];
                index++;
            }
        }

        while(index < n) {
            nums[index] = 0;
            index++;
        }

        for(int num : nums) {
            System.out.print(num + " ");
        }
    }
}
