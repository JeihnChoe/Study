package ex04;

class Account {
    // 입금(입금할 금액, 잔액)
    int deposit(int amount, int money) {
        int restMoney = money + amount;
        return restMoney; // 리턴은 메서드를 호출한 라인의 복귀 주소로 값 반환
    }

    // 출금(출금할 금액, 잔액)
    int withdraw(int amount, int money) {
        int restMoney = money - amount;
        return restMoney;
    }

    // 이체
    int transfer(int sender, int receiver, int amount) {
        int senderAccount = sender - amount;
        int receiverAccount = receiver + amount;

        return receiverAccount;
    }
}

public class Meth03 {
    public static void main(String[] args) {
        // 홍길동의 잔액
        int hMoney = 1000;
        // 임꺽정의 잔액
        int iMoney = 1000;

        // 홍길동이 입금을 2번하고, 출금 한번하기
        Account hAccount = new Account();
        hMoney = hAccount.deposit(100, hMoney);
        System.out.println("남은 금액 : " + hMoney);

        hMoney = hAccount.deposit(500, hMoney);
        System.out.println("남은 금액 : " + hMoney);

        hMoney = hAccount.withdraw(300, hMoney);
        System.out.println("남은 금액 : " + hMoney);

        // 임꺽정이 입금을 1번(100원)하고, 출금 2번(300원, 500원)하기
        Account iAccount = new Account();
        iMoney = iAccount.deposit(100, iMoney);
        System.out.println("남은 금액 : " + iMoney);

        iMoney = iAccount.withdraw(300, iMoney);
        System.out.println("남은 금액 : " + iMoney);

        iMoney = iAccount.withdraw(500, iMoney);
        System.out.println("남은 금액 : " + iMoney);

        // 이체

    }
}