import java.util.Scanner;

public class CarryOn {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(true) {
            System.out.println("Shall we carry on?");
            String answer = scan.nextLine();
            if(answer.equals("no")) {
                break;
            }

        }
        scan.close();
    }
}