class Solution {

    public int solution(int a, int b) {
        int answer = 0;

        String stra = String.valueOf(a);
        String strb = String.valueOf(b);

        String biggera = stra + strb;
        String biggerb = strb + stra;

        a = Integer.parseInt(biggera);
        b = Integer.parseInt(biggerb);

        answer = (a > b) ? a : b;

        return answer;
    }
}
