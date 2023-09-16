import java.util.Scanner;

public class taller_2 {
    public static void main(String[] args) {

        /*
         * El ejercicio de la rama 1, pero preguntando al 
         * usuario si quiere realizar un nuevo cálculo antes de 
         */

                 Scanner scanner = new Scanner(System.in);
                 int opcion=0;

                 


        do {

        int n1,n2;
        System.out.println("Ingrese numero 1");
        n1 = scanner.nextInt();
        System.out.println("Ingrese numero 2");
        n2 = scanner.nextInt();

        System.out.println("la suma es "+(n1+n2));
        System.out.println("la resta es "+(n1-n2));
        System.out.println("la multiplicacion es "+(n1*n2));
        System.out.println("la division es "+(n1/n2));

        if (opcion>=0 || opcion<=1) {
        System.out.println("desea hacer de nuevo la operacion ? \n"+
        "Presina (0) para salir.");
        opcion = scanner.nextInt();    
        }

            
        } while (opcion !=0);




        }
}
