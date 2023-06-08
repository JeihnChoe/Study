package ex05.transferMoney;

abstract public class Account {

    abstract public String getBankerName();

    abstract public void setBankerName(String bankName);

    abstract public String getNumAccount();

    abstract public void setNumAccount(String numAccount);

    abstract public int getBalance();

    abstract public void setBalance(int balance);

    abstract public int getDepositWithdrawMoney();

    abstract public void setDepositWithdrawMoney(int depositWithdrawMoney);

}
