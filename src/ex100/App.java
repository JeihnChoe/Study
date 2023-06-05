package ex100;

public class App {

    static void attack(Zealot z1, Dragoon d1) {
        d1.hp = d1.hp - z1.attack;
        System.out.println("드라군의 남은 체력은 : " + d1.hp);
    }

    public static void main(String[] args) {

        Zealot z1 = new Zealot("질럿1", 100, 10);
        Dragoon d1 = new Dragoon("드라군1", 100, 5);

        attack(z1, d1);
    }
}
