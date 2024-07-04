import java.util.Scanner;

public class ContaTerminal {
    public ContaTerminal(){    
    }
    public static void main(String[] args) {
        Scanner readingAgency = new Scanner(System.in);

        System.out.println("Enter your agency number: ");
        int numberAgency = readingAgency.nextInt();
        System.out.println("The digital agency was: " + numberAgency);

        Scanner readingAccount = new Scanner(System.in);

        System.out.println("Enter your account number with the digit: ");
        String numberAccount = readingAccount.nextLine();
        System.out.println("The account number entered was: " + numberAccount);

        Scanner readingName = new Scanner(System.in);

        System.out.println("Enter your full name: ");
        String name = readingName.nextLine();
        System.out.println("The name entered was: " + name);

        Scanner readingBalance = new Scanner(System.in);

        System.out.println("Enter your balance: ");
        String balance = readingBalance.nextLine();
        System.out.println("Your available balance is: " + balance);

    }
}
