import java.util.Scanner;

public class Euclides {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero 1");
        int number1 = sc.nextInt();
        System.out.println("Ingrese el numero 2");
        int number2 = sc.nextInt();


        long startTime = System.nanoTime();
        int MCD = euclides(number1, number2);
        long endTime = System.nanoTime();


        System.out.print("El M.C.D de numero 1: " + number1 + " y el numero 2: " + number2 + " es " + MCD);
        System.out.println("\nTiempo transcurrido: " + (endTime - startTime) + " ns");
    }

    public static int euclides (int number1, int number2){
        while (number2 != 0) {
            int temp = number2;
            number2 = number1 % number2;
            number1 = temp;
        }

        return number1;
    }

}

