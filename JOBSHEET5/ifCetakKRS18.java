import java.util.Scanner;

public class ifCetakKRS18 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("---print KRS SIAKAR---");
        System.out.println("Have a tuition fees been paid in full? (true/false): ");
        boolean uktLunas = sc.nextBoolean();
        
        if (uktLunas) {
            System.out.println("UKT payment has been verified");
            System.out.println("KRS now can be printed");
        }
        
    }
}
