package proysem04;
import java.util.Scanner;
/**
 *
 * @author LAB-USR-PT116-E406
 */
public class CasoElvis {
    public static void main(String[] args) {
          Scanner scan=new Scanner (System.in);
         System.out.println ("Ingrese su edad: ");
         int edad=scan.nextInt();
        String texto= (edad>=18?"Mayor de Edad":"Menor de edad");
        //:significa sino :D
          System.out.println (texto);
        
          System.out.println ("Ingrese la marca: ");
         String marca=scan.next();
       
        double precio=(marca.equals("Toyota")?10000 : 8000);
        System.out.println ("Su vehiculo cuesta $: "+precio);
    }
}