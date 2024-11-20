import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] array = new int[N];

        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < N - 1; i += 2) {
            int temp = array[i];
            array[i] = array[i + 1];
            array[i + 1] = temp;
        }

        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}