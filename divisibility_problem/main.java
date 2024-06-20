import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); 
        
        int[] results = new int[t];

        for (int i = 0; i < t; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int remainder = a % b;

            if (remainder == 0) {
                results[i] = 0; 
            } else {
                results[i] = b - remainder; 
            }
        }

        for (int i = 0; i < t; i++) {
            System.out.println(results[i]);
        }
    }
}
