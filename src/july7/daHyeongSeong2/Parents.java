package july7.daHyeongSeong2;

/**
 * 다형성
 * 부모가 자식이 가진 특성을 가져다 쓸 때 사용
 * (자식이 재정의한 메소드 사용 가능
 *  but, 자식 고유의 메소드는 사용 불가능)
 *  상속 받은 메소드를 오버라이딩해서 사용
 *  타입은 부모 참조는 자식
 */
public class Parents {
    public void method1(){
        System.out.println("Parents-method1.");
    }
    public void method2(){
        System.out.println("Parents-method2.");
    }
}
