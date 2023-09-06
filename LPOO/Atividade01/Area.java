import java.io.IOException;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) throws IOException {

        float a, b, c, tri, cir, tra, qua, ret;
        double pi;
        Scanner r = new Scanner(System.in);

        a = r.nextFloat();
        b = r.nextFloat();
        c = r.nextFloat();

        tri = (a * c) / 2;

        pi = 3.14159;
        cir =  3,14159 * (c*c);

        tra = ((a + b) * c) / 2;

        qua = (4 * b);

        ret = (a * b);

        System.out.printf("TRIANGULO: %.3f\n", tri);
        System.out.printf("CIRCULO: %.3f\n", cir);
        System.out.printf("TRAPEZIO: %.3f\n", tra);
        System.out.printf("QUADRADO: %.3f\n", qua);
        System.out.printf("RETANGULO: %.3f\n", ret);
    }
}
