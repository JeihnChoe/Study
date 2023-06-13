package ex06;

//1. 추상클래스는 new 할수없다.
//2. 추상클래스는 일반메서드와 추상메서드를 가질 수 있다. 
//3. 추상클래스는 상태변수를 가질 수 있다. 

abstract class 동물 {

    String name;

    public void run() { // run은 동물들이 공통적으로 가지고있고 동일함.
        System.out.println("달린다."); // {sout "달린다"}바디로 바로 지정해줌
    }

    public abstract void speak(); // 동불들이 가지고있지만, 어떻게 우는지는 서로 다름
                                  // abstract 로 만들어서 자식오브젝트들이 동적바인딩을 통해 speak를 어떻게 울지 정해줌.

}

class 사자 extends 동물 {
    @Override
    public void speak() {
        System.out.println("으르렁");
    }

}

class 호랑이 {

}

public class Abstract01 {
    public static void main(String[] args) {

        동물 d1 = new 사자();
        d1.name = "사자1";
    }
}