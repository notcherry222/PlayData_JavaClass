package july3.stringEqual;

public class StringEqualExample {
    public static void main(String[] args){

        //메모리 공유
        String strVar1 = "Cl";
        String strVar2 = "Cl";

        if(strVar1 == strVar2){
            System.out.println("they are same");
        } else{
            System.out.println("they are different");
        }

        //같은 값을 갖는 다른 객체로 생성
        String strVar3 = new String("cl");
        String strVar4 = new String("cl");

        //메모리 주소값 비교
        if(strVar3 == strVar4){
            System.out.println("they are same");
        } else{
            System.out.println("they are different");
        }
        //실제로 갖는 값 비교->equals 메서드 이용
        if (strVar3.equals(strVar4)){
            System.out.println("they are same");
        }
    }
}
