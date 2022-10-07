
import java.util.Scanner;


/**
 *
 * @author Yesid Linares
 */
public class Main {
     public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese una estación del año >>> ");
        String est = teclado.nextLine();
        String estacion = est.toUpperCase();
        switch(estacion){
            case "INVIERNO":
                System.out.println("Es INVIERNO");
                break;
            case "VERANO":
                System.out.println("Es VERANO");
                break;
            case "OTOÑO":
                System.out.println("Es OTOÑO");
                break;
            case "PRIMAVERA":
                System.out.println("Es PRIMAVERA");
                break;
            default :
                System.out.println("No ingresó una estación del año.");
                break;
        }
    }
}
