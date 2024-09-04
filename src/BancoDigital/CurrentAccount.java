package BancoDigital;

public class CurrentAccount extends Account{


    public CurrentAccount(Client client) {
        super(client);
    }

    public void printBankStatement(){
        System.out.println("### Current Account Statement ###");
        super.printExtract();
    }
}
