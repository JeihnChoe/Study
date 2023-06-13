package ex05.transferMoney;

public class AccountRim extends Account {

    String bankerName;
    String numAccount;
    int balance;

    public String getBankerName() {
        return bankerName;
    }

    public void setBankerName(String bankerName) {
        this.bankerName = bankerName;
    }

    public String getNumAccount() {
        return numAccount;
    }

    public void setNumAccount(String numAccount) {
        this.numAccount = numAccount;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public AccountRim(String bankerName, String numAccount, int balance) {
        this.bankerName = bankerName;
        this.numAccount = numAccount;
        this.balance = balance;

    }

}
