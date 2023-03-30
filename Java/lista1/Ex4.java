import java.util.Scanner;
public class Ex4 {
    public static void main(String[]args){
        double x, y, resul;
        char o;
        Scanner r = new Scanner(System.in);
        while(true){
            x = r.nextDouble();
            o = r.next().charAt(0);
            y = r.nextDouble();
            switch (o){
                case '+':
                    resul = x + y;
                    System.out.println(resul);
                break;

                case '-':
                    resul = x - y;
                    System.out.println(resul);
                break;

                case '/':
                    resul = x / y;
                    System.out.println(resul);
                break;

                case '*':
                    resul = x * y;
                    System.out.println(resul);
                break;
                }
        if(o == 'x'){
            break;
            }
        }
    }
}
