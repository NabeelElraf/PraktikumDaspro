
import java.util.Scanner;

public class AccessWifiCampus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String message;

        System.out.print("Enter The User Type: ");
        String Usertype = sc.nextLine().trim();

        if (Usertype.equalsIgnoreCase("lecturer")) {
            message = "Access Wi-Fi (lecturer) Granted";

        } else if (Usertype.equalsIgnoreCase("Students")) {
            System.out.print("Enter The Sks Taken: ");
            int SKS = sc.nextInt();
            if (SKS >= 12) {
                message = "Access Student Wifi Granted";
            } else {
                message = "Access Denied";
        }

        } else {
            message = "Access Denied!";
        }

        System.out.println(message);

        }
    }
