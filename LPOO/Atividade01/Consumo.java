import java.io.IOException;
import java.util.Scanner;

public class Consumo {
    public static void main(String[] args) throws IOException {

        int km;
        float combu, consumo;

        Scanner r = new Scanner(System.in);

        km = r.nextInt();
        combu = r.nextFloat();

        consumo = km/combu;

        System.out.printf("%.3f km/l\n", consumo);

    }
}
