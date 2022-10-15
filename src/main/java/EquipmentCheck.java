import java.util.Scanner;

public class EquipmentCheck {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Temperature1: ");
        int temperature1 = scanner.nextInt();
        System.out.println("Temperature2: ");
        int temperature2 = scanner.nextInt();
        if (temperature1 > 100 && temperature2 < 100) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
