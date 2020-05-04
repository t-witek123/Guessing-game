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

        System.out.println("Your age: "+ age+ "Your name is: "+ name);

    }
}
