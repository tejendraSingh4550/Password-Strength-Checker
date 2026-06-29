import java.util.Random;

public class PasswordChecker {

    public static void checkPassword(String password) {

        boolean upper = false;
        boolean lower = false;
        boolean digit = false;
        boolean special = false;

        for (char ch : password.toCharArray()) {

            if (Character.isUpperCase(ch))
                upper = true;

            else if (Character.isLowerCase(ch))
                lower = true;

            else if (Character.isDigit(ch))
                digit = true;

            else
                special = true;
        }

        int score = 0;

        if (password.length() >= 8)
            score++;

        if (upper)
            score++;

        if (lower)
            score++;

        if (digit)
            score++;

        if (special)
            score++;

        System.out.println("\n--------- RESULT ---------");

        if (score <= 2)
            System.out.println("Password Strength : WEAK");
        else if (score == 3 || score == 4)
            System.out.println("Password Strength : MEDIUM");
        else
            System.out.println("Password Strength : STRONG");

        System.out.println("\nSuggestions:");

        if (password.length() < 8)
            System.out.println("- Password should contain at least 8 characters.");

        if (!upper)
            System.out.println("- Add uppercase letter.");

        if (!lower)
            System.out.println("- Add lowercase letter.");

        if (!digit)
            System.out.println("- Add a number.");

        if (!special)
            System.out.println("- Add a special character.");

        if (score == 5)
            System.out.println("- Excellent Password!");

        System.out.println("\nGenerated Strong Password:");
        System.out.println(generatePassword());
    }

    public static String generatePassword() {

        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String special = "@#$%&*!";

        String all = upper + lower + numbers + special;

        Random random = new Random();

        StringBuilder password = new StringBuilder();

        for (int i = 0; i < 12; i++) {

            int index = random.nextInt(all.length());

            password.append(all.charAt(index));
        }

        return password.toString();
    }
}