import java.util.Scanner;

public class Squared{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter integer: ");
        int value = Integer.valueOf(scanner.nextLine());

        int result = value * value;
        System.out.println(result);

        scanner.close();
    }
}