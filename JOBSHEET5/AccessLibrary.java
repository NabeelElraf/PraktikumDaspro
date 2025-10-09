import java.util.Scanner;

public class AccessLibrary {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String message; 
        
        System.out.print("Do you have KTM? (true/false): ");
        boolean KTM = sc.nextBoolean();

        if (KTM) {
            message ="Enter Successfully";
            System.out.println(message);
        }else {
            System.out.print("Do a online registration? (true/false): ");
            boolean registrasiOnline = sc.nextBoolean();
            if (registrasiOnline) {
                message = "Enter Successfully";
            }else {
                message = "Enter denied";
        }
        System.out.println(message);
        }
    }
}