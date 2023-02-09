import java.io.Console;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Kilonuzu Giriniz: ");
        double kilo = input.nextDouble();
        System.out.print("Boyunuzu Giriniz: ");
        double boy = input.nextDouble();
        double endeks = kilo/boy*boy;
        System.out.println(endeks);




























    }
}
