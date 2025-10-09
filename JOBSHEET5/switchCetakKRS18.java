import java.util.Scanner;
public class switchCetakKRS18 {


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("---print KRS SIAKAR---");
        System.out.println("Enter current semester: ");
        int semester = sc.nextInt();

        switch (semester) {
            case 1:
            System.out.println("KRS Semester 1 is displayed");
                break;
            case 2:
            System.out.println("KRS Semester 2 is displayerd");
                break;
            case 3:
            System.out.println("KRS Semester 3 is displayerd");
                break;
            case 4:
            System.out.println("KRS Semester 4 is displayerd");
                break;
            case 5:
            System.out.println("KRS Semester 5 is displayerd");
                break;
            case 6:
            System.out.println("KRS Semester 6 is displayerd");
                break;
            case 7:
            System.out.println("KRS Semester 7 is displayerd");
                break;
            case 8:
            System.out.println("KRS Semester 8 is displayerd");
                break;
        
            default:

            System.out.println("Invalid Semeser");
        }
        }
        
    }



