import java.util.Scanner;

public class ReshapeTheMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] mat = new int[m][n];

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        int r = sc.nextInt();
        int c = sc.nextInt();

        if(m * n != r * c) {
            System.out.println("Reshape Not Possible");
            return;
        }

        int[][] result = new int[r][c];
        int index = 0;

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                result[index / c][index % c] = mat[i][j];
                index++;
            }
        }

        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
