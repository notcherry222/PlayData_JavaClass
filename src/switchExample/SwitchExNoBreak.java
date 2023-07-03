package switchExample;

public class SwitchExNoBreak {
    public static void main(String[] args) {

        //8<= <12 사이의 정수
        int time = (int)(Math.random()*4)+8;

        switch(time) { //break없으면 쭉 진행
            case 8 :
                System.out.println("Going work");

            case 9 :
                System.out.println("having meeting");

            default:
                System.out.println("out office");
        }
    }
}
