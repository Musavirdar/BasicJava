
import java.util.Random;
import java.util.Scanner;

class Games{
    public int Number;
    public int InputNumber;
    public int Noofgusses = 0;

    public int getNoofgusses() {
        return Noofgusses;
    }

    public void setNoofgusses(int Noofgusses) {
        this.Noofgusses = Noofgusses;
    }


    Games() {
        Random rand = new Random();
        this.Number = rand.nextInt(5);

    }
    void TakeUserInput(){
        System.out.println("Guess the Number....!");
        Scanner sc = new Scanner(System.in);
        InputNumber = sc.nextInt();

    }
    boolean isCorrectNumber() {
        Noofgusses++;
        if (InputNumber == Number) {

            System.out.format("you Guessed it right... \n, it was %d\n you guessed it in %d attempts", Number, Noofgusses);

            return true;
        } else if (InputNumber < Number) {
            System.out.println("too low...");

        } else if (InputNumber > Number) {
            System.out.println("too High...");

        }

        return false;

    }
}
public class guess {
    public static void main(String[] args) {
        boolean b = false;
        Games g = new Games();
        while (!b) {

            g.TakeUserInput();
            b = g.isCorrectNumber();
        }
    }
    }


