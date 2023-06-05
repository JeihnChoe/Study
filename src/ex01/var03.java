package ex01;

public class var03 {
    public static void main(String[] args) {
        // 업캐스팅, 묵시적 형변환 (작은걸 큰데다가 넣었으니까)
        int n1 = 10;
        double d1 = n1;
        System.out.println(d1);

        //다운캐스팅, 명시적 형변환 - 더 작은데다가 큰데로 넣어야하니 안들어감. 그래서 명시적으로 형 변환을 해줘야한다.
        double d2 = 10.5;
        int n2 = (char)d2;
        System.out.println(n2);

        //문자 형변환 (아스키코드)
        byte ch = 65;
        char data = (char)ch;
        
        System.out.println(data);

    

    }
}
