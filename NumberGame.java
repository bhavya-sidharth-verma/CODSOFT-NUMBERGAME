import java.util.Scanner;
import java.lang.Math;

public class NumberGame {
    public static void guess() {
        Scanner sc = new Scanner(System.in);
        int num = 1 + (int) (100 * Math.random());
        int N = 10;
        int i, input;
        System.out.println("Guess a Number between 1 to 100 within "+ N +" tries");

        for (i = 0; i < N; i++) {
            System.out.println("Enter the Number");
            input = sc.nextInt();

            if (num == input) {
                System.out.println("Congratulations you guessed it right");
                break;
            } else if (input > num && i != N - 1) {
                System.out.println("The number you've entered is greater ");
            } else if (input < num && i != N - 1) {
                System.out.println("The number you've entered is less ");
            }
        }
        if (i == N) {
            System.out.println("You used all your Guesses ");
            System.out.println("The number was " + num);

        }
    }
    //main function
    public static void main(String[] arg) {
        guess();
    }
}