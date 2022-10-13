package BabyLion;

public class Watermelon {
    public String solution(int n) {
        String answer = " ";

        for(int i=1; i<=n; i++){
            if(i%2==0) {
                answer += "박";
            }else {
                answer += "수";
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Watermelon wm = new Watermelon();
        System.out.println("n이 3인 경우 : " + wm.solution(3));
        System.out.println("n이 4인 경우 : " + wm.solution(4));
    }
}
