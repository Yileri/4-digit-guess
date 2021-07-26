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

            while (number1==number2 || number1==number3 || number1==number4 || number2==number3 || number2==number4
            || number3==number4) {
                number = rand.nextInt(9000) + 1000;

                number1 = number%10;
                number2 = (number%100 - number%10)/10;
                number3 = (number%1000 - number%100)/100;
                number4 = (number%10000 - number%1000)/1000;
            }

            int[] guessArray = {guess1, guess2, guess3, guess4};
            int[] numberArray = {number1, number2, number3, number4};

            for (int i=0; i<guessArray.length; i++) {
                for (int j=0; j<numberArray.length; j++) {
                    if (guessArray[i] == numberArray[j]) {
                        correctNumber += 1;
                    }
                }
                if (guessArray[i] == numberArray[i]) {
                    correctPlace += 1;
                }
            }

            if (correctNumber==0 && correctPlace==0) {
                System.out.println("None of the numbers are correct.");
            } else if (correctPlace == 0) {
                System.out.println(correctNumber + " of the numbers are correct and none of them are in the right place.");
            } else {
                System.out.println(correctNumber  + " of the numbers are correct and " + correctPlace + " of them are in the right place.");
            }

            guess = console.nextInt();
        }

        System.out.println("You have found the number!");
    }
}
