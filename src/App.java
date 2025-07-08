import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        // Variablen
        String nameString = "Nydiro";
        int age = 28;

        // Ausgabe
        System.out.println("Hallo, mein Name ist " + nameString + " und ich bin " + age + " Jahre alt.");

        // Scanner Objekt für User-Input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bitte geben Sie Ihren Namen ein: ");
        String nameInputString = scanner.nextLine();

        System.out.println("Bitte geben Sie Ihr Alter ein: ");
        int ageInput = scanner.nextInt();

        scanner.close();

        System.out.println("Hallo, mein Name ist " + nameInputString + " und ich bin " + ageInput + " Jahre alt.");
    }
}
