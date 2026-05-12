import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Sismos> sismos = new ArrayList<>();

        System.out.print("Ingresa el region del Sismos: ");
        String region = sc.nextLine();

        System.out.print("Ingresa el epicentro del Sismo: ");
        String valor = sc.nextLine();

        System.out.print("Ingresa la magnitud del Sismo: ");
        float magnitud = sc.nextFloat();

        sismos.add(new Sismos(region, valor, magnitud));



    }
}