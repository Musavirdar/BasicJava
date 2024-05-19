import java.util.Random;
import java.util.Scanner;

class RockPaperScissor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
int CompInp;
int UserInput;

                // Here we take input from the user
                System.out.println("enter the '0' for Rock '1' for Paper and '2' for Scissor  ");
                UserInput = sc.nextInt();

                // now we generate random input from computer...

                Random random = new Random();
                CompInp = random.nextInt(3);

                // checking for invalid inputs.

                if (UserInput == 0 || UserInput == 1 || UserInput == 2) {
                    System.out.println("");

                } else {
                    System.out.println("INVALID MOVE...");
                    System.out.println("exiting the game");
                    break;
                }

                // by using the if conditional statement we compare inputs ..

                if (UserInput == CompInp) {
                    System.out.println("DRAW...");

                } else if (UserInput == 0 && CompInp == 1 || UserInput == 1 && CompInp == 0 || UserInput == 2 && CompInp == 1) {
                    System.out.println("You Lose, Computer won");
                } else {
                    System.out.println("Congratulations You win");
                }

                System.out.println("if you want continue PRESS 1, for discontinue PRESS any other key. ");
                 UserInput = sc.nextInt();
                if (UserInput == 1) {
                    System.out.println("");


                } else {
                    System.out.println("Thanks");

                    break;
                }

            }     }

            }



