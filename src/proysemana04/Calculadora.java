package proysemana04;
import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args) {
        Scanner scan=new Scanner (System.in);
        double suma, resta,producto, division; 
        System.out.println ("Ingrese dos números: ");
        double numb1=scan.nextDouble();
        double numb2=scan.nextDouble();
        
        System.out.println ("Que operación desea realizar: ");
        String operación=scan.next();
        
      switch (operación) {
      case "suma":
          suma=numb1+numb2;
          System.out.println ("La suma es: "+suma);
          break;
      case "resta": 
          resta=numb1-numb2;
          System.out.println ("La resta es: "+resta);
          break;
      case "producto": 
          producto=numb1*numb2;
          System.out.println ("El producto es: "+producto);
          break;
      case "division": 
          division=numb1/numb2;
          System.out.println ("La división es: "+division);  
          break;
      default: 
          System.out.println ("Operación invalida");   
        }
    }
}
        
    
        
        
        
