import java.util.Scanner;

public class taller_2 {
    public static void main(String[] args) {

        //ejercicio simple con las 4 operaciones y dos numeros solicitados por teclado

        Scanner scanner = new Scanner(System.in);
        int n1,n2;
        System.out.println("Ingrese numero 1");
        n1 = scanner.nextInt();
        System.out.println("Ingrese numero 2");
        n2 = scanner.nextInt();

        System.out.println("la suma es "+(n1+n2));
        System.out.println("la resta es "+(n1-n2));
        System.out.println("la multiplicacion es "+(n1*n2));
        System.out.println("la division es "+(n1/n2));

    }
}
