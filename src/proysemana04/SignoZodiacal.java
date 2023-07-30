package proysemana04;
import java.util.Scanner;
public class SignoZodiacal {
    public static void main(String[] args) {
        Scanner scan=new Scanner (System.in);
        System.out.println ("Ingrese el dia y mes de su cumpleaños : ");
        int dia=scan.nextInt();
        String mes=scan.next();
        
        switch (mes) {
        case "Enero":
            if (dia >= 21) {
            System.out.println ("acuario");
            } else {
            System.out.println ("capricornio");
            }
            break;
        case "Febrero":
            if (dia >= 19) {
              System.out.println ("piscis");
            } else {
                System.out.println ("acuario");
            }
            break;
        case "Marzo":
            if (dia >= 20) {
              System.out.println ("aries");
            } else {
                 System.out.println ("piscis");
            }
            break;
        case "Abril":
            if (dia >= 20) {
                 System.out.println ("tauro");
            } else {
                System.out.println ("aries");
            }
            break;
        case "Mayo":
            if (dia >= 21) {
                 System.out.println ("geminis");
            } else {
                System.out.println ("tauro");
            }
            break;
        case "Junio":
            if (dia >= 20) {
                System.out.println ("cancer");
            } else {
                  System.out.println ("geminis");
            }
            break;
        case "Julio":
            if (dia >= 22) {
                 System.out.println ("leo");
            } else {
                  System.out.println ("cancer");
            }
            break;
        case "Agosto":
            if (dia >= 21) {
                  System.out.println ("virgo");
            } else {
                 System.out.println ("leo");
            }
            break;
        case "Septiembre":
            if (dia >= 22) {
                 System.out.println ("libra");
            } else {
                 System.out.println ("virgo");
            }
            break;
        case "Octubre":
            if (dia >= 22) {
                 System.out.println ("escorpio");
            } else {
                 System.out.println ("libra");
            }
            break;
        case "Noviembre":
            if (dia >= 21) {
                 System.out.println ("sagitario");
            } else {
                 System.out.println ("escorpio");
            }
            break;
        case "Diciembre":
            if (dia >= 21) {
                 System.out.println ("capricornio");
            } else {
                  System.out.println ("sagitario");
            }
            break;
        default: 
          System.out.println ("Datos invalidos");   
        }
    }
}