import java.util.Scanner;

public class IsPrime {
    public static boolean is_Prime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number display ");
        int numbers = scanner.nextInt();
        int count = 0;
        int N = 2;
        while (count < numbers) {
            if (is_Prime(N)){
                System.out.println(N);
                count++;
            }
            N++;
        }
        scanner.close();
    }
}
