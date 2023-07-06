package july6_static_singleton.singleton;

/**
 * 전체 프로그램에서 하나의 객체만 만들도록!
 * 유저에게 콘텐츠 제공할 때 사용.
 * 접근하지 못 하게 private
 */
public class SingleTon {
    public static SingleTon single = new SingleTon();
    private SingleTon(){}
    static SingleTon getInstance(){
        return single;
    }
}
