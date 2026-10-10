import java.util.Scanner; // import scanner

public class Main {

    static Scanner scanner = new Scanner(System.in); // set up scanner object
    public static void main(String[] args) {

        // Define variables
        double balance = 0;
        int choice;
        boolean isRunning = true;

        // Display menu
        System.out.println("Bank program");
        System.out.println("------------");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Check balance");
        System.out.println("4. EXIT");

        // ask for user choice
        while(isRunning){
            System.out.print("Enter a choice (1-4): ");
            choice = scanner.nextInt();

            // validate user choice
            switch(choice){
            case 1 : balance += deposit();
            break;
            case 2 : balance -= withdraw(balance);
            break;
            case 3 : showBalance(balance);
            break;
            case 4 : isRunning = false;
            break;
            default : System.out.println("INVALID CHOICE!");
            break;
        }
        }
        System.out.println("You have EXITED the program, Thankyou!");


        scanner.close(); // closes scanner
    }
    // Show balance method
    static void showBalance(double balance){
        System.out.println("-----------------------");
        System.out.printf("Your balance is %.2f $\n", balance);
    }
    // Deposit method
    static double deposit(){
        double amount;
        System.out.print("Enter deposit amount: ");
        amount = scanner.nextDouble();

        if(amount<=0){
            System.out.println("Amount cannot be 0 or negtive");
            return 0;
        }
        else{
            System.out.println("Amount deposited");
            return amount;
        }
    }
    // withdraw method
    static double withdraw(double balance){
        double amount;
        System.out.print("Enter withdrawl amount: ");
        amount = scanner.nextDouble();
        if(amount<=0){
            System.out.println("Enter a valid amount");
            return 0;
        }
        else if(amount>balance){
            System.out.println("Insufficient balance");
            return 0;
        }
        else{
            System.out.println("Amount withdrawn!");
            return amount;
        }
        

    }
}
