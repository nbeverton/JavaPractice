package BancoDigital;

public class Main {

    public static void main(String[] args) {

        Client everton = new Client();
        everton.setName("Everton Barbosa");

        Account cc = new CurrentAccount(everton);
        Account savings = new SavingsAccount(everton);

        cc.deposit(100);
        cc.transfer(50, savings);

        cc.printInfo();
        savings.printInfo();
        
    }
}
