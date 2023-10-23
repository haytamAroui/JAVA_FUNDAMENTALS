package Les1.Oefening1;

public class MainApp {
    public static void main(String[] args) {

        /* BankA bankA = new BankA();
        BankB bankB = new BankB();
        BankC bankC = new BankC();
        System.out.println("Bank A :" +bankA.getBalance());
        System.out.println("Bank B :" +bankB.getBalance());
        System.out.println("Bank C :" +bankC.getBalance());*/

      Bank[] banks = {new BankA(), new BankB(), new BankC()};
        for (Bank bank: banks) {
            System.out.println("Bank  :" +bank.getBalance());
        }

    }

}
