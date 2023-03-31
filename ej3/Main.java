import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número entero positivo: ");
        String numero = sc.nextLine();

        if (numero.matches("\\d+") && Integer.parseInt(numero) > 0) {
            int numCifras = numero.length();
            System.out.println("El número " + numero + " tiene " + numCifras + " cifras.");
        } else {
            System.out.println("Debe introducir un número entero positivo.");
        }
    }
}