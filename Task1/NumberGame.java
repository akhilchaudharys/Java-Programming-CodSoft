import java.util.Scanner;

public class NumberGame {
    
    public static void main(String[] args)
    {
        @SuppressWarnings("resource")
        Scanner sc=new Scanner(System.in);

        //generating a number between 1 to 100
        int answer = (int)(Math.random() * 100) + 1;

        //number of attempts allowed is assigned
        int n=7;

            //Checking if the user has guessed the number
    boolean correct = false;

    System.out.println("I'm thinking of a number between 1 and 100.\nYou get 7 chances to guess the number.");

    while (n > 0) 
    {
      System.out.println("Enter your guess: ");
      int guess = sc.nextInt();

      // if the user guesses correctly, print the congratulation message and exit the program
      if (guess == answer) {
        System.out.println("Congrats, Your guess is right ! \nYou win ! ");
        correct=true;
        break;
      }

      // if the user's guess is greater than the number, print the feedback
      else if (guess > answer) {
        System.out.println("Your guess is too high. Try again !\nYou have " + (n - 1) + " attempts left.");
        
      }

      // if the user's guess is lesser than the number, print the feedback 
      else {
        System.out.println("Your guess is too low. Try again !\nYou have " + (n - 1) + " attempts left.");
      }

      // after each trial decrease the number of trials by 1
      n--;
    }
   
    // if the user has run out of trials, print the message and exit the program

    if (correct == false) {
      System.out.println("Sorry you ran out of tries.\nThe correct answer was "+answer);
    }

  }
}


    