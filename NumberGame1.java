package Codsoft.java;
import java.util.Random;
import java.util.Scanner;


public class NumberGame1 {
    public static void main(String[] args) {
    Random random = new Random();
    int randomNumber= random.nextInt(100)+1;
        System.out.println("Enter your Guess(1-100):");

    Scanner sc = new Scanner(System.in);
    int playerGuess= sc.nextInt();

    int attempt=5;

        while(true){
            if(playerGuess==randomNumber){
                System.out.println("Correct! You Win!");
                break;
            }else if(playerGuess>randomNumber){
                System.out.println("Nope! Too High.");

            } else {
                System.out.println("Nope! Too low.");

            }


        }



        }
    }

