package ex06;

interface Remocon {
    void on();

    void off();

}

class 삼성 implements Remocon {
    public void on() {
        System.out.println("티비켜다");
    }

    public void off() {
        System.out.println("티비끄다");
    }
}

class 엘지 implements Remocon {
    public void on() {
        System.out.println("티비켜다");
    }

    public void off() {
        System.out.println("티비끄다");
    }
}

public class Inter02 {
    public static void main(String[] args) {

    }
}
