package july6_static_singleton.finalObject;

/**
 * 불변의 값, final
 * 불볍의 값을 저장하는 필드를 자바에서는 상수라고 함.
 * final 필드는 객체마다 저장, 생성자의 매개값을 통해 여러 가지 값을 가질 수 있음 -> 상수라고 볼 수 없는 이유!
 * 이넘은 상수 타입이기 때문에 대문자로 작성
 *
 */
public class FinalObject {
    final String nation = "Korea";
    String name;

    public FinalObject(String name){
        this.name = name;
    }
}
