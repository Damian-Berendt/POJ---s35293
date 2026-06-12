public abstract class Loan implements LoanConstants {
    protected String loanNumber;
    protected String customerLastName;
    protected double loanAmount;
    protected double interestRate;
    protected int term;

    public Loan(String loanNumber, String customerLastName, double loanAmount, int term) {
        this.loanNumber = loanNumber;
        this.customerLastName = customerLastName;

        if (loanAmount > MAX_LOAN_AMOUNT) {
            System.out.println("ERROR, your loan amount is too high, max loan: " + MAX_LOAN_AMOUNT);
            this.loanAmount = 0;
        } else {
            this.loanAmount = loanAmount;
        }

        if (term == SHORT_TERM || term == MEDIUM_TERM || term == LONG_TERM) {
            this.term = term;
        } else {
            System.out.println("Error, wrong term. Term is set to short");
            this.term = SHORT_TERM;
        }
    }

    @Override
    public String toString(){
        double loanFee = loanAmount * interestRate * term;
        double totalAmountOwed = loanAmount + loanFee;
        return "Loan number: " + loanNumber + ", Customer: " + customerLastName + ", Amount: " + loanAmount + ",Interest rate(%): " + interestRate * 100.0 + ", term: " + term + ", Total amount owed: " + totalAmountOwed;
    }
}
