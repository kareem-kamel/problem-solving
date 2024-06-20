import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        ArrayList<String> items = new ArrayList<>();

        for (int i = 0; i < number; i++) {
            String item = scanner.nextLine();
            items.add(item);
        }

        int count_bit = 0;
        int count_solve = 0;
        for (String item : items) {

            for (int i = 0; i < item.length(); i++) {
                if (item.charAt(i) == '1') {
                    count_bit += 1; 
                }else{
                    continue;
                }
            }

            if (count_bit >= 2) {
                count_solve += 1;   
            }
            count_bit=0;
        }

        System.out.println(count_solve);
        scanner.close();
    }
}

