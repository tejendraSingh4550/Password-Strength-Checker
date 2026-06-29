import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("================================");
        System.out.println("   PASSWORD STRENGTH CHECKER");
        System.out.println("================================");

        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        PasswordChecker.checkPassword(password);

        sc.close();
    }
}