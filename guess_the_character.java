import java.util.Random;
import java.util.Scanner;
class Game1{
    char character;
    char randomChar;
    int noOfGuess =0;

    public char randomChar(){
        Random r = new Random();
        return(char)(r.nextInt(26)+'A');
    }
    public void takeUserInput(){
        System.out.println("Enter the character in capital letter");
        Scanner sc = new Scanner(System.in);
        character = sc.next().charAt(0);
    }
    public void checkChar() {
        noOfGuess++;
        if(character == randomChar){
            System.out.format("You guess it right\n character is %c,\nyou guess in %d tries",randomChar,noOfGuess);
        }
    }
}

public class guess_the_character{
    public static void main(String[] args){
        int chance =5;
        Game1 game = new Game1();
        game.randomChar = game.randomChar();
        System.out.println("You have only"+ chance +"chance to guess the character");
        for (int i=0;i<5;i++){
            chance--;
            game.takeUserInput();
            game.checkChar();
            if(game.character == game.randomChar){
                return;
            }
            System.out.println("You have left"+ chance +"chance to guess the character");
        }
        if(game.character!=game.randomChar){
            System.out.println("Better luck next time,\nplease try again\n character is"+game.randomChar);
        }
    }
}
