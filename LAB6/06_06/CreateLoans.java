import java.util.Scanner;

public class CreateLoans {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Loan[] loans = new Loan[5];

        System.out.print("Enter prime rate in percent: ");
        double primeRate = scanner.nextDouble() / 100.0;


        for (int i = 0; i < 5; i++) {
            System.out.println("Enter data: ");
            System.out.print("Choose loan type, Business / Personal: ");
            String loanType = scanner.nextLine();

            System.out.print("Loan number: ");
            String loanNumber = scanner.nextLine();

            System.out.print("Customer last name: ");
            String lastName = scanner.nextLine();

            System.out.print("Loan amount: ");
            double amount = scanner.nextDouble();

            System.out.print("Term - 1, 3 or 5: ");
            int term = scanner.nextInt();


            if (loanType == "Business") {
                loans[i] = new BusinessLoan(loanNumber, lastName, amount, term, primeRate);
            }
            else {
                loans[i] = new PersonalLoan(loanNumber, lastName, amount, term, primeRate);
            }
        }

        System.out.println("\n\n --- ALL LOAns ---");

        for (Loan loan : loans) {
            System.out.println(loan.toString());
        }

        scanner.close();
    }
}