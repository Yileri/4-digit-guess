import java.util.*;

public class Main {
    public static void main (String[] args){
        Scanner console = new Scanner(System.in);
        Random rand = new Random();

        int number = rand.nextInt(9000) + 1000;
        System.out.println("I have chosen a random 4-digit-number. Try to guess it.");
        int guess = console.nextInt();
    }
}
