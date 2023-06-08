package ex05.transferMoney;

public class AccountRim extends Account {

    String bankerName;
    String numAccount;
    int balance;
    int depositWithdrawMoney;

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

    public int getDepositWithdrawMoney() {
        return depositWithdrawMoney;
    }

    public void setDepositWithdrawMoney(int depositWithdrawMoney) {
        this.depositWithdrawMoney = depositWithdrawMoney;
    }

    public AccountRim(String bankerName, String numAccount, int balance, int depositWithdrawMoney) {
        this.bankerName = bankerName;
        this.numAccount = numAccount;
        this.balance = balance;
        this.depositWithdrawMoney = depositWithdrawMoney;
    }

}
