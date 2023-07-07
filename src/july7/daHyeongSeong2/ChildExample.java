package july7.daHyeongSeong2;

public class ChildExample {
    public static void main(String[] args) {
        Child child = new Child();

        Parents parents = child;

        parents.method1();
        parents.method2();
        /**
         * parents.method3(); 불가능
         */
    }
}
