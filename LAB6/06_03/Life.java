public class Life extends Insurance {

    public Life() {
        super("Life");
        setCost();
    }

    @Override
    public void setCost() {
        this.monthlyPrice = 36.0;
    }

    @Override
    public void display() {
        System.out.println("Insurance type: " + getInsuranceType() + ", " + "Monthly price: " + getMonthlyPrice());
    }
}
