package proysem04;
import java.util.Scanner;
/**
 *
 * @author LAB-USR-PT116-E406
 */
public class Caso01 {
    
    public static void main(String[] args) {
        
  //Condicional multiple SWITCH
  Scanner scan=new Scanner (System.in);
  System.out.println ("Ingrese la nota: ");
  String nota=scan.next();
    
  switch (nota) {
      case "A":
          System.out.println ("Excelente");
          break;
      case "B": case "C":
          System.out.println ("Bien hecho");
          break;
      case "D": case "E": 
          System.out.println ("Con las justas");
          break;
      case "F": 
          System.out.println ("Intente otra vez");  
          break;
      default: 
          System.out.println ("Nota invalida");   
        }
      System.out.println ("Su calificacion es: "+nota);  
    }
}