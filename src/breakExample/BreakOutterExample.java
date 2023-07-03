package breakExample;

public class BreakOutterExample {
    public static void main(String[] args) throws Exception{

        //중첩된 for문에서는 label(여기에서는 Outter로 지정)을 붙여 break 걸어주기.
        Outter:
        for(char upper = 'A'; upper<='Z'; upper ++){
            for(char lower = 'a'; lower<='z'; lower++){
                System.out.println(upper + "-" + lower);
                if (lower == 'g'){
                    break Outter;
                }
            }
        } System.out.println("exit"); //for문이 종료되는 시점에 출력
    }
}
