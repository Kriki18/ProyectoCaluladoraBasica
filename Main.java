import java.util.Scanner;
public class Main {
 public static void main(String [] args){

     Scanner erik = new Scanner (System.in);
     System.out.print("Ingresa un numero para x:\n");
     String x=erik.nextLine();
     System.out.print("Ingresa un numero para y: \n");
     String y=erik.nextLine();
     String res=x+y;
     System.out.print(res);
 }
}
