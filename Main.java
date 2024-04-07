import java.util.Scanner;
import java.util.Random;

interface Incrementable
{
    public  int nextInt();
    public float nextDouble();
}



public class Main implements Incrementable{

    public static void randomGame() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(0, 11);
        System.out.println("would you like to play the random number game? Y/N");
        String playGame = scanner.next();
        do {
            for (int guesses = 1; guesses < 4; guesses++) {
                System.out.println("enter a random number between 1 and 10");
                int userNumber = scanner.nextInt();
                while (userNumber > 10 || userNumber < 0) {
                    System.out.println("that is not in the range try again");
                    userNumber = scanner.nextInt();
                }


                if (userNumber > randomNumber) {
                    System.out.println("guess is too high");
                } else if (userNumber < randomNumber) {
                    System.out.println("guess is too low");
                } else {
                    System.out.println("guess is correct! you took : " + guesses + "guesses");
                    break;
                }
                System.out.println("current guesses is : " + guesses);
                if (guesses == 2) {
                    System.out.println("this is your final guess hope you're feeling lucky!");
                }
                if (guesses == 3 && randomNumber != userNumber) {
                    System.out.println("Too bad you have lost! the magic number was " + randomNumber);
                }
            }
            System.out.println("you have lost! would you like to play again?  Y/N");
            playGame = scanner.next();
        }while(playGame.equals("Y")||playGame.equals("Yes"));
        System.out.println("Thank you for playing the game!");

    }
    public int nextInt()
    {
        Random random = new Random();
        int randomNumber1 = random.nextInt();
        return randomNumber1;
    }
    public float nextDouble()
    {
        Random random = new Random();
        float randomFloat = random.nextFloat();
        return randomFloat;
    }

    public static void main(String[] args) {
     randomGame();
    }
}
