package july6_static_singleton.accessLimit;

/**
 * 접근 제한자 종류
 * 1. public : 외부 클래스 자유롭게 사용 가능. 패키지명 달라도 사용 가능
 * 2. private : 같은 패키지 혹은 자식 클래스에서 사용 가능. 아무도 쓰지마!
 * 3. protected : 외부에서 사용 불가능. private 객체 생성했을 때 처럼. 자식클래스에서도 사용 불가능.
 * 4. default : public 생략했으면 클래스는 default 접근 제한을 가짐. 같은 패키지라면 사용 가능.
 */
public class AccessLimit {
    public static void main(String[] args) {

    }
}
