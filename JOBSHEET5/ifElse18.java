import java.util.Scanner;

public class ifElse18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String message;

        System.out.println("Enter The Number: ");
        int angka = sc.nextInt();

        if (angka % 2 == 0) {
            message = "Even";
        } else { 
            message = "Odd";
        }
        System.out.println(message);
    }
}