
import java.util.Scanner;

/**
 *
 * @author Yesid Linares
 */
public class Main {
    public static void main (String[] args){
        Scanner teclado = new Scanner(System.in);
            int numeroIf = teclado.nextInt();

            if (numeroIf == 0){
                System.out.println("El numero es 0");
            }
            if (numeroIf > 0){
                System.out.println("El numero es POSITIVO.");
            }
            if (numeroIf < 0){
                System.out.println("El número es NEGATIVO.");
            }
    }
}
