import java.util.*;

public class Main {
    public static void main (String[] args){
        Scanner console = new Scanner(System.in);
        Random rand = new Random();

        int number = rand.nextInt(9000) + 1000;
        System.out.println("I have chosen a random 4-digit-number. Try to guess it.");
        int guess = console.nextInt();

        while (guess != number) {
            int correctNumber = 0;
            int correctPlace = 0;

            int guess1 = guess%10;
            int guess2 = (guess%100 - guess%10)/10;
            int guess3 = (guess%1000 - guess%100)/100;
            int guess4 = (guess%10000 - guess%1000)/1000;

            int number1 = number%10;
            int number2 = (number%100 - number%10)/10;
            int number3 = (number%1000 - number%100)/100;
            int number4 = (number%10000 - number%1000)/1000;

        }
    }
}
