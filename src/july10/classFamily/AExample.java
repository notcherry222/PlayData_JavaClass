package july10.classFamily;

public class AExample {
    public static void main(String[] args) {
        A a = new A();

        // 인스턴스 멤버 클래스 객체 생성
        A.B b = a.new B();
        b.field = 3;
        b.method1();

        //정적 멤버 클래스 객체 생성
        A.C c = new A.C();
        c.field1 = 3;
        c.method1();
        A.C.field2 =3;
        A.C.method2();

        //로컬 클래스 객체 생서응ㄹ 위한 메서ㅗ드 호틀
        a.method();
    }
}
