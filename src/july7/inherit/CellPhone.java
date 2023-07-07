package july7.inherit;

/**
 * private은 상속받을 수 없다.
 * 부모와 자식이 다른 패키지에 존재한다면
 * default 접근 제한을 갖는 필드와 메소드도 상속 대상에서 제외된다
 */
public class CellPhone {
    //필드
    String model;
    String color;

    //생성자는 없음. 기본 생성자 사용

    //메소드
    void power(){
        System.out.println("power on.");
    }
    void bell(){
        System.out.println("Bell is ringing.");
    }
    void sendVoice(String message) {
        System.out.println("for me : " +message);
    }
}
