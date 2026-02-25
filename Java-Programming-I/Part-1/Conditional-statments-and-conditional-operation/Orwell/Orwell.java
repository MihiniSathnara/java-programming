import java.util.Scanner;

public class Orwell {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number: ");
        int result = Integer.valueOf(scanner.nextLine());

        if(result == 1984){
            System.out.println("Orwell");
        }

        scanner.close();
    }
    
}
