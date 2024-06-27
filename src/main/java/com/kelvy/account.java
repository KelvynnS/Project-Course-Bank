package com.kelvy;

public class account {

    private String name;
    private int id;
    private Double balance;
    private String accountData;

    public account() {
    }

    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Double getBalance() {
        return balance;
    }
    public void setBalance(Double balance) {
        this.balance = balance;
    }
    public void saque(Double d){
        this.balance = this.balance - d - 5;
    }
    public String getAccountData() {
        return accountData;
    }
    public void deposito(Double m){
        this.balance = this.balance + m;
    }

}
 


