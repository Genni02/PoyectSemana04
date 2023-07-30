package proysemana04;
import java.util.Scanner;
public class CompañiaSeguros {
    public static void main(String[] args) {
        Scanner scan=new Scanner (System.in);
        int Panual, Panual2;
        System.out.println ("Ingrese el número de personas que tendran el seguro: ");
        int perso=scan.nextInt();
        System.out.println ("Ingrese el tipo de seguro: ");
        String tseg=scan.next();
        
        switch (tseg) {
        case "A":
            if (perso<=8) {
            Panual=(5*perso)*12;
            System.out.println ("Tendra que pagar anualmente: "+Panual);
            } else {
            Panual2=(40+8*(perso-8))*12;
            System.out.println ("Tendra que pagar anualmente: "+Panual2);
            }
            break;
        case "B":
            if (perso<=6) {
            Panual=(5*perso)*12;
            System.out.println ("Tendra que pagar anualmente: "+Panual);
            } else {
            Panual2=(30+8*(perso-6))*12;
            System.out.println ("Tendra que pagar anualmente: "+Panual2);
            }
            break;
        case "C":
            if (perso<=4) {
            Panual=(5*perso)*12;
            System.out.println ("Tendra que pagar anualmente: "+Panual);
            } else {
            Panual2=(20+5*(perso-4))*12;
            System.out.println ("Tendra que pagar anualmente: "+Panual2);
            }
            break;
        case "D":
            if (perso<=2) {
            Panual=(5*perso)*12;
            System.out.println ("Tendra que pagar anualmente: "+Panual);
            } else {
            Panual2=(10+5*(perso-2))*12;
            System.out.println ("Tendra que pagar anualmente: "+Panual2);
            }
            break;
        default: 
          System.out.println ("Datos invalidos");   
}
    }
}
