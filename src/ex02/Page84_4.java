package ex02;

public class Page84_4 {
    public static void main(String[] args) {
        boolean P = true;
        boolean Q = true;
        boolean and = P && Q;
        boolean or = P || Q;
        boolean xor = !P && Q;
        System.out.println("P\t"+"Q\t" + "AND\t" + "OR\t" + "XOR");
        System.out.println(P+"\t"+Q+"\t"+and+"\t"+or+"\t"+xor);
        System.out.println("true\t"+"false\t"+and+"\t"+or+"\t"+xor);
        System.out.println("false\t"+"true\t"+and+"\t"+or+"\t"+xor);
        System.out.println("false\t"+"false\t"+and+"\t"+or+"\t"+xor);


        }
}
