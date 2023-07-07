package july7.methodRefract;

/**
 * 부모로부터 상속받은 메소드1
 * 자식이 수정하면?
 * ->에러는 없음. 자바는 일단 생성자가 있는 필드의 메소드를 호출함
 * 부모 객체에서 생성자를 만들고 메소드 1 실행? -> 부모 메소드 1 실행
 * 자식 객체에서 생성자 만들고 메소드 1 실행? -> 수정된 자식 메소드 1 실행
 * 그럼에도 자식이 부모의 일부분을 허용해서 수정하고 싶다면 super 사용
 * final은 @override 불가능
 */

public class ComputerEX {
    public static void main(String[] args) {

        int r = 9;
        Calculator cal = new Calculator();
        System.out.println(cal.areaCircle(r));

        Computer cp = new Computer();
        System.out.println(cp.areaCircle(r));
    }
}
