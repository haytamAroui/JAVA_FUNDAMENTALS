package Les1.Oefening1;

abstract class Bank {
    protected double balance;
    public void deposit (double i) {

        this.balance=balance+ i;
    }

    public abstract double getBalance();


}
