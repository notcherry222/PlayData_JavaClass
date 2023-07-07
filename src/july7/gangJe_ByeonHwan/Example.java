package july7.gangJe_ByeonHwan;

/**
 * 강제변환 -> 자식타입이 부모 타입으로 변환되어 있는 상태에서만 가능
 * 객체 타입 확인 -> 부모인지 자식인지 알 수 있는 방법, Instanceof 연산자. -> return T or F
 */

public class Example {
    public static void method4(Parents parent){
        Child child = (Child) parent;
        System.out.println("method4 child 변환 성공");
    }
    public static void method3(Parents parent){
        if(parent instanceof Child){
            Child child1 = (Child) parent;
            System.out.println("child 변환 성공");
        }else {
            System.out.println("변환 실패");
        }
    }
    public static void main(String[] args) {
        Parents pt = new Child();
        pt.field1 = "data1";
        pt.method1();
        pt.method2();
        /**
         * pt.field2 = "data2" 불가능
         * pt.method3 불가능
         */
        Child child = (Child) pt; //자식 메소드 사용하고 싶으면
        child.field2 = "data2";
        child.method3();

        Parents parentA = new Child();
        method3(parentA);
        method4(parentA);

        Parents parentB = new Parents();
        method3(parentB);
        //method4(parentB); // 예외발생
    }

}
