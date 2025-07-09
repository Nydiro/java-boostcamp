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

        // if-else
        if (ageInput >= 65) {
            System.out.println("Du gehörst zu unseren erfahrenen Benutzern!");
        } else if (ageInput >= 18) {
            System.out.println("Du bist volljährig!");
        } else {
            System.out.println("Du bist noch minderjährig");
        }
        
        System.out.println("Hallo, mein Name ist " + nameInputString + " und ich bin " + ageInput + " Jahre alt.");

        // for-loop
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
        
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }
        
        System.out.println("Bitte geben Sie die gewünschte Anzahl an Wiederholungen ein: ");
        int loopCount = scanner.nextInt();
        for(int i = 1; i <= loopCount; i++) {
            System.out.println("Dies ist Wiederholung Nr.: " + i);
        }
        
        scanner.close();
    }
}
