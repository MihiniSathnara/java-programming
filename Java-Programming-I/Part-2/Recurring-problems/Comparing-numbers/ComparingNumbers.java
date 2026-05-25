import java.util.Scanner;

public class ComparingNumbers {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first Number:");
        int first = Integer.valueOf(scan.nextLine());

        System.out.println("Enter second number:");
        int second = Integer.valueOf(scan.nextLine());

        if(first > second){
            System.out.println(first +" greater than " +second);
        } else if(first < second) {
            System.out.println(first +" is less than " +second);
        } else {
            System.out.println(first +" is equal to " +second);
        }

        scan.close();
    }
}