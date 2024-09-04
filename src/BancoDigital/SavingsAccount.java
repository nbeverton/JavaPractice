package BancoDigital;

public class SavingsAccount extends Account{
    public SavingsAccount(Client client) {
        super(client);
    }

    public void printBankStatement(){
        System.out.println("### Savings Account Statement ###");
        super.printExtract();
    }
}
