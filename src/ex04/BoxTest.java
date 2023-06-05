package ex04;

class Box {
    int getVolume(int width, int length, int height) {
        int volume = width * length * height;
        return volume;
    }
}

public class BoxTest {
    public static void main(String[] args) {

        Box myBox = new Box();

        int volume = myBox.getVolume(10, 20, 10);
        System.out.println(volume);
    }
}
