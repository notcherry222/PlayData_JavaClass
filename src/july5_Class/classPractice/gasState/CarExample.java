package july5_Class.classPractice.gasState;

public class CarExample {
    public static void main(String[] args) {

        Car myCar = new Car();

        myCar.setGas(6);

        boolean gasState = myCar.isLeft();

        if (gasState){ //true 면 고
            System.out.println("Start to move");
            myCar.run();
        }else {
            System.out.println("You need to charge");
        }
    }
}
