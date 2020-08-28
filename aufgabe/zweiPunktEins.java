import java.util.Scanner;

public class zweiPunktEins {

    public static void main(String[] args) {
        String frage1, frage2;
        int age;
        boolean married;
        double height;

        Scanner scanVar = new Scanner(System.in);
        System.out.println("Wie ist dein Vorname?");
        frage1 = scanVar.next();
        Scanner scannerVar = new Scanner(System.in);
        System.out.println("Wie ist dein Nachname?");
        frage2 = scanVar.next();
        Scanner scanVarInt = new Scanner(System.in);
        System.out.println("Wie alt bist du?");
        age = scanVar.nextInt();
        Scanner scanVarBool = new Scanner(System.in);
        System.out.println("Bist du verheiratet?");
        married = scanVarBool.nextBoolean();
        Scanner scanVarDouble = new Scanner(System.in);
        System.out.println("Wie groß bist du in Metern?");
        height = scanVarBool.nextDouble();
        System.out.println("name: " + frage1 + "| family Name: " +  frage2 + "| age: " + age + "| married: " + married + "| height: " + height);
    }
}