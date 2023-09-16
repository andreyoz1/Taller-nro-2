import java.util.Scanner;

public class taller_2 {
    public static void main(String[] args) {
         final String USER = "admin";
        String myUser;
        String userPassword;
        byte userAge;
        final byte MIN_AGE=18;

    
        final String PASSWORD = "12345";
        

        Scanner myscanner = new Scanner(System.in);
      

        do {
            System.out.println("Ingrese el usuario");
            myUser=myscanner.nextLine();

            System.out.println("Ingrese la contraseña");
            userPassword=myscanner.nextLine();

        } while ((!myUser.equals(USER))&&(!userPassword.equals(PASSWORD)));        
        myscanner.close();

    }
}
