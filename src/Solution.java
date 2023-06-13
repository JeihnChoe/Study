class Solution {

    public class Solution {
        public int solution(int a, int b) {
            int answer = 0;
            
            String biggera =(String)a +(String)b;
            String biggerb =(String)b +(String)a;
            
            if(biggera >=biggerb){
                answer = biggera;
            }else {answer = biggerb}
            
            return answer;
        }
    }
}
