import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        
        int[] host_arr=new int[t];
        int[] guest_arr=new int[t];

        for(int i=0;i<t;i++){
            int first_input=scanner.nextInt();
            int second_input=scanner.nextInt();

            host_arr[i]=first_input;
            guest_arr[i]=second_input;
        }
        
        int countof_games=0;
        for(int i=0;i<t;i++){
            for(int j=0; j<t;j++){

                if(host_arr[i]==guest_arr[j]){
                    countof_games+=1;
                }else{
                    continue;
                }

            }   
        }
        System.out.println(countof_games);
    }

    
}