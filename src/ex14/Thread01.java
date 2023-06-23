package ex14;

public class Thread01 {

    // CPU가 하나의 스레드를 생성하여 실행된다.
    // 처음에는 하나의 스레드 == main 메서드만 존재 <-----------메인스레드
    public static void main(String[] args) {

        new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("서브쓰레드 : " + i);

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        for (int i = 0; i < 5; i++) {
            System.out.println("메인쓰레드 : " + i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
