import java.util.Scanner;

public class PasswordVerifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password;
        boolean isStrong = false;

        while (!isStrong) {
            System.out.print("Enter a strong password: ");
            password = scanner.nextLine();

            boolean hasCapital = false;
            boolean hasSpecial = false;
            boolean hasNumber = false;

            for (char c : password.toCharArray()) {
                if (Character.isUpperCase(c)) {
                    hasCapital = true;
                } else if (!Character.isLetterOrDigit(c)) {
                    hasSpecial = true;
                } else if (Character.isDigit(c)) {
                    hasNumber = true;
                }
            }

            if (hasCapital && hasSpecial && hasNumber) {
                System.out.println("Strong password!");
                isStrong = true;
            } else {
                System.out.println("Weak password. Please ensure your password contains:");
                if (!hasCapital) {
                    System.out.println(" * At least one capital letter");
                }
                if (!hasSpecial) {
                    System.out.println(" * At least one special character");
                }
                if (!hasNumber) {
                    System.out.println(" * At least one number");
                }
            }
        }

        scanner.close();
    }
}