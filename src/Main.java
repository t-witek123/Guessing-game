import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("This is going to be a guessing game that you can play if you are mature person");
        Scanner scanner =new Scanner(System.in);
        System.out.println("How old are You? ");
        int age =scanner.nextInt();
        scanner.nextLine();
        System.out.println("What's Your name? ");
        String name =scanner.nextLine();
        System.out.println("Your name is: " + name + "; Your are: " + age + " y.o");

        if (age>=18) {
            System.out.println("Your age is about right, you can play this sick game.");
            System.out.println("");
            System.out.println("Enter your guess: ");
            int hidden = 25;
            int guess = scanner.nextInt();
            do {


                if (guess==hidden){
                    System.out.println("Congratulation, your guess is correct");
                    break;
                }else{
                    if (guess>hidden) {
                        System.out.println("Try lower number");
                    }
                    if (guess<hidden) {
                        System.out.println("Try higher number");
                    }
                }

            }while (guess==hidden);

            }else {
                System.out.println("Sorry man, You need to grow up to play it :) ");
        }






    }
}
