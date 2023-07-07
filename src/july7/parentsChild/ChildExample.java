package july7.parentsChild;

public class ChildExample {
    public static void main(String[] args) {
        Child child = new Child();

        Parents parents = child;

        parents.method1();
        parents.method2();
        /**
         * parents.method()3; 호출 불가
         */
    }
}
