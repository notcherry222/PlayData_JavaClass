package switchExample;

public class SwtichExWithBreak {
    public static void main(String[] args) {
        int num = (int)(Math.random()*6)+1;
        switch(num) {  //switch 는 조건문이 아닌, 변수만 넣으면 됨
            case 1 :
                System.out.println("1번");
                break;		//switch-break 필수
            case 2 :
                System.out.println("2번");
                break;
            case 3 :
                System.out.println("3번");
                break;
            case 4 :
                System.out.println("4번");
                break;
            case 5 :
                System.out.println("5번");
                break;
            default : //default는 마지막. 위의 케이스의 예외 케이스의 경우 실행
                System.out.println("1번");
                break;

        }
    }

}

