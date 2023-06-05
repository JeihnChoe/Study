package ex02;
import java.util.*;
public class Page85_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("상품가격");
        double price = sc.nextDouble();
        System.out.println("받은돈");
        double money = sc.nextDouble();

        double vat = price*0.1;
        double remain = money - price - vat ; 

        System.out.println("받은 돈 : "+money);
        System.out.println("상품 가격 : "+price);System.out.println("부가세 : "+vat);System.out.println("잔돈 : "+remain);




    }
}
