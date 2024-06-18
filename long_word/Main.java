import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int number=Integer.parseInt(scanner.nextLine());
        ArrayList<String> items=new ArrayList<>();

        for(int i=0;i<number;i++){
            String item=scanner.nextLine();
            items.add(item);
        }
        
        for(String item:items){

            int last_index=item.length()-1;
        
            if (item.length()>10) {

                System.out.println(""+item.charAt(0)+(item.length()-2)+item.charAt(last_index));
            }
            else{
                
                System.out.println(item);
            }
        }     
    }
}
