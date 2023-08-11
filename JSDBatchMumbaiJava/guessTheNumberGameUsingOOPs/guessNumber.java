import java.util.Random;
import java.util.Scanner;

class Game{
    int number;
    int inputNumber;
    int numberOfGuesses=0;

    Game(){
        Random rand = new Random();
        this.number = rand.nextInt(100);
    }

    void takeUserInput(){
        System.out.println("Guess the number");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
    }

    boolean correctNumber(){
        numberOfGuesses++;
        if(number == inputNumber){
            System.out.printf("Yes youre are guesed it right , it was %d\nYou guesed in it %d attempts ",number,numberOfGuesses);
            return true;
        }
        else if(number < inputNumber){
            System.out.println("Too High.......");
        }
        else if(number > inputNumber){
            System.out.println("Too Low.....");
        }
        return false;
    }
}

public class guessNumber {
    public static void main(String[] args) {
        Game g = new Game();
        boolean b = false;
        while(!b){
            g.takeUserInput();
            b = g.correctNumber();
        }
    }
}
