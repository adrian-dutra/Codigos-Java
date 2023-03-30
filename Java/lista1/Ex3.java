import java.util.Scanner;
public class Ex3 {
    public static void main(String[]args){
        int x;
        Scanner r = new Scanner(System.in);
        
        x = r.nextInt();

        if(x%2==0){
            System.out.println("Par");
        }
        else{
            System.out.println("Impar");
        }
    }
}
