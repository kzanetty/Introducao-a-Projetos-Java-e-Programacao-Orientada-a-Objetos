package entities;

public class Account {

    private Integer numberAccount;
    private String name;
    private double balance;

    public Account(Integer numberAccount, String name){
        this.numberAccount = numberAccount;
        this.name = name;
        this.balance = 0.0;
    }

    public Account(Integer numberAccount, String name, double amount){
        this.numberAccount = numberAccount;
        this.name = name;
        deposit(amount);
    }

    public Integer getNumberAccount(){
        return numberAccount;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public double getBalance(){
        return balance;
    }

    public void deposit(double amount){
        balance += amount;
    }
    public void withdraw(double amount){
        balance -= amount + 5.0;
    }

    @Override
    public String toString(){
        return "Account number: "+numberAccount+" - Name: "+name+" - Balance: $"+balance;
    }

}
