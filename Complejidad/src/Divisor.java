import java.util.Scanner;

public class Divisor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero 1");
        int number1 = sc.nextInt();
        System.out.println("Ingrese el numero 2");
        int number2 = sc.nextInt();


        long startTime = System.nanoTime();
        int MCD = mcdDivisor(number1, number2);
        long endTime = System.nanoTime();


        System.out.print("El M.C.D de numero 1: " + number1 + " y el numero 2: " + number2 + " es " + MCD);
        System.out.println("\nTiempo transcurrido: " + (endTime - startTime) + " ns");
    }

    public static int mcdDivisor(int number1, int number2){
        int divisor = 1;

        for (int i = 1; i <= Math.min(number1, number2); i++) {
            if (number1 % i == 0 && number2 % i == 0) {
                divisor = i;
            }
        }


        return divisor;
    }

}




