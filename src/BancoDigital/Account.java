package BancoDigital;

public abstract class Account implements IAccount{

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agency;
    protected int number;
    protected double balance;
    protected Client client;


    public Account(Client client){
        this.agency = Account.AGENCIA_PADRAO;
        this.number = SEQUENCIAL++;
        this.client = client;
    }


    @Override
    public void withdraw(double value) {
        balance -= value;
    }

    @Override
    public void deposit(double value) {
        balance += value;
    }

    @Override
    public void transfer(double value, IAccount targetAccount) {
        this.withdraw(value);
        targetAccount.deposit(value);
    }

    protected void printInfo(){
        System.out.printf("Holder: %s%n", this.client.getName());
        System.out.printf("Agency: %s%n", this.agency);
        System.out.printf("Number: %s%n", this.number);
        System.out.printf("Balance: %s%n", this.balance);
    }

    @Override
    public void printExtract() {

    }

    public int getAgency() {
        return agency;
    }

    public int getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public Client getClient() {
        return client;
    }
}
