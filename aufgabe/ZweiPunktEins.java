import java.util.Scanner;

public class ZweiPunktEins {

    public static void main(String[] args) {

        Scanner scanVar = new Scanner(System.in);
        System.out.println("Wie ist dein Vorname?");
        String frage1 = scanVar.next();
        System.out.println("Wie ist dein Nachname?");
        String frage2 = scanVar.next();
        System.out.println("Wie alt bist du?");
        int age = scanVar.nextInt();
        System.out.println("Bist du verheiratet?");
        boolean married = scanVar.nextBoolean();
        System.out.println("Wie groß bist du in Metern?");
        double height = scanVar.nextDouble();
        System.out.printf("name: %s| family Name: %s| age: %d| married: %s| height: %f", frage1 ,frage2 ,age ,married ,height);
    }
}