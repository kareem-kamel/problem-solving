import java.util.Scanner;

public class main{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        
        int weight=Integer.parseInt(scanner.nextLine());

        if (weight%2==0&&weight>2) {
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
        
    }
}