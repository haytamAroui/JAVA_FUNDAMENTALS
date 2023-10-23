package Les1.Oefening1;

public class BankA extends Bank{
    public BankA() {
        super();
        this.deposit(1000);
    }

    @Override
    public double getBalance() {

        return this.balance;
    }


}
