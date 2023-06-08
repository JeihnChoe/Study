package ex05.transferMoney;

import java.util.Scanner;

public class Transfer {

    static void transfer(Account u1, Account u2) {
        u1.setBalance(u1.getBalance() - u1.getDepositWithdrawMoney());
        u2.setBalance(u2.getBalance() + u1.getDepositWithdrawMoney());

        System.out.println("예금주 :" + u1.getBankerName() + "  보낸금액:" + u1.getDepositWithdrawMoney() + "원  잔액:"
                + u1.getBalance() + "원");
        System.out.println("예금주 :" + u2.getBankerName() + "  받은금액:" + u1.getDepositWithdrawMoney() + "원  잔액:"
                + u2.getBalance() + "원");
    }

    static void deposit(Account u1) {
        u1.setBalance(u1.getBalance() + u1.getDepositWithdrawMoney());
        System.out.println("예금주 :" + u1.getBankerName() + "  예금액:" + u1.getDepositWithdrawMoney() + "원  잔액:"
                + u1.getBalance() + "원");
    }

    static void withdraw(Account u1) {

        u1.setBalance(u1.getBalance() + u1.getDepositWithdrawMoney());
        System.out.println("예금주 :" + u1.getBankerName() + "  출금액:" + u1.getDepositWithdrawMoney() + "원  잔액:"
                + u1.getBalance() + "원");
    }

    public static void main(String[] args) {
        Account h1 = new AccountHong("홍길동", "110-218-667734", 10000, 500);
        Account r1 = new AccountRim("임꺽정", "66550-47487-112", 3500, 0);

        Scanner sc = new Scanner(System.in);
        System.out.println("하실 업무를 선택하세요.");
        System.out.println("입금/출금/송금");
        String input = sc.nextLine();

        System.out.println("이름을 입력하세요");
        String bankername = sc.nextLine();

        System.out.println("금액을 입력하세요");
        int amount = sc.nextInt();

        if (input == "입금" && bankername == "홍길동")
            deposit(h1);
        if (input == "출금" && bankername == "홍길동")
            withdraw(h1);
        if (input == "송금" && bankername == "홍길동")
            deposit(h1);

    }
}
