import java.util.Scanner;

public class SecondsInADay{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many days whould you like to convert into seconds?");
        int noOfDays = Integer.valueOf(scanner.nextLine());
        System.out.println("You gave " +noOfDays +" Day/s.");

        int noOfSeconds = noOfDays * 24 * 60 * 60;
        System.out.println(noOfDays +" in seconds: " +noOfSeconds);
    }
}