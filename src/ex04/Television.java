package ex04;

class Channel {

    void printStatus(int Channel, int volume, boolean onOff) {
        System.out.println("텔레비전 채널은 " + Channel + "이고 볼륨은 " + volume + "이고 현재 " + onOff + " 상태입니다.");
    }
}

public class Television {
    public static void main(String[] args) {
        Channel myTv = new Channel();

        myTv.printStatus(7, 10, true);
    }

}
