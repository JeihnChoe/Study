package ex02;

class Wtf {
    String difficult = "fucking difficult";
    static int cost = 1000;
}
public class Mem01 {
    public static void main(String[] args) {
    
        int price = 10000;
        System.out.println(price); // 1) 메인이 실행된 이후 선언되어 있는 변수는 바로 불러올 수 있다. (정적변수)

        Wtf wtf = new Wtf();               // 2) 작업하는 해당 클래스 외부에서 설정이 되어있으면 클래스를 먼저 호출해야한다. 클래스를 호출하는 문법은 new.
        System.out.println(wtf.difficult); // 클래스이름 쓰고, 변수 지정하고, = new 클래스명();  문법으로 호출한거기 때문에 heap의 영역에 cache되어있음. (동적변수)
       
        System.out.println(Wtf.cost); // 3) 단, 다른 class에서라도 static 이 선언되어있다면, 이는 RAM의 static 영역에 cache 되어있기 때문에
                                        //      바로 접근 가능하기 때문에 class명만 표기해주면 뒤에 static으로 지정된 변수를 바로 불러올수있다.

        System.out.println(wtf.difficult); 
        //new로 클래스를 호출해주지않고 바로 Wtf 클래스를 호출하는 경우, difficult 는 static으로 선언되어있지 않기 때문에 Wtf class로 가더라도 difficult를 찾지 못한다.
    }
}