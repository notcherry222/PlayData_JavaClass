package switchExample;

public class SwitchCharEx {
    public static void main(String[] args){
        char grade = 'A';

        switch(grade){
            case 'A':
            case 'a':
                System.out.println("우수회원쓰");
                break;
            default:
                System.out.println("손님");
        }
    }
}
