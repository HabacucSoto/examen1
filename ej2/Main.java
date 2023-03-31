import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789._-*/¡?&!¿@";
        String contrasena = "";
        System.out.println("****** Generador de contrasenas ******");
        System.out.println("Ingresa la longitud deseada de tu contrasena:");
        int lon = in.nextInt();
        for(int i = 1; i <= lon; i++){
            int randomInt = rnd.nextInt(caracteres.length());
            char randomChar = caracteres.charAt(randomInt);
            contrasena += randomChar;
        }
        System.out.println("Contrasena: " + contrasena);
    }
}
