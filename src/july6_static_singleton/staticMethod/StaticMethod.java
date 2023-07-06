package july6_static_singleton.staticMethod;

public class StaticMethod {
    /**
     * 클래스가 메모리로 로딩되면 정적 멤버를 바로 사용할 수 있다. -> 도트 연산자로 접근
     */
    int speed;
    //자동 생성자
    void run(){
        System.out.println("run");
    }

    /**
     * static이기 때문에 this를 사용하는 것은 컴파일 에러 발생
     * 따라서 참조 변수를 생성한 후에 클래스 안에 메소드를 호출해야 함.
     * 클래스 이름으로 접근해야 하지만 객체 참조 변수(myCar)로도 접근이 가능하다. <- 하지만 클래스 추 //todo 왜?
     * @param args
     */
    public static void main(String[] args) { //static 써있으므로 정적필드임
        StaticMethod sm = new StaticMethod();
        sm.speed = 60; //객체가 갖고 있는 필드
        sm.run();      //객체가 갖고 있는 메소드
    }

}
