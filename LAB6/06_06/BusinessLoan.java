public class BusinessLoan extends Loan {
    public BusinessLoan(String loanNumber, String customerLastName, double loanAmount, int term, double primeInterestRate) {
        super(loanNumber, customerLastName, loanAmount, term);
        this.interestRate = primeInterestRate + 0.01;
    }
}
