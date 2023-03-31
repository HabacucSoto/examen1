import java.util.Scanner;
public class Main {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Ingresa tu peso:");
        double peso = in.nextDouble();
        System.out.println("Ingresa tu altura en metros:");
        double altura = in.nextDouble();
        double imc = peso / (altura * altura);
        if(imc < 18.5){
            System.out.println("IMC: " + imc + "\n" + "Bajo peso");
        }else if(imc >= 18.5 && imc <= 24.9){
            System.out.println("IMC: " + imc + "\n" + "Peso normal");
        }else if(imc >= 25 && imc <= 29.9){
            System.out.println("IMC: " + imc + "\n" + "Sobrepeso");
        }else if(imc >= 30 && imc <= 34.9){
            System.out.println("IMC: " + imc + "\n" + "Obesidad 1");
        }else if(imc >= 35 && imc <= 39.9){
            System.out.println("IMC: " + imc + "\n" + "Obesidad 2");
        }else{
            System.out.println("IMC: " + imc + "\n" + "Obesidad 3");
        }
    }
}
