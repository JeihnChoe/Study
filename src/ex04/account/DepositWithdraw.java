package ex04.account;

class DepositWithdraw {

    int[] deposit(int amount, int balance) {
        int newBalance = balance + amount;
        int amountBalance[] = { amount, newBalance };
        return amountBalance;

    }

    int[] withdraw(int amount, int balance) {
        int newBalance = balance - amount;
        int amountBalance[] = { amount, newBalance };
        return amountBalance;
    }
}
