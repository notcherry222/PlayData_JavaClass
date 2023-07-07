package july7.choosangClass;

/**
 * 추상 클래스!
 * 는 상속만 가능
 * 추상 클래스는 추상 메소드를 선언할 수 있다.
 * -> 추상 메소드를 상속 받으려면 재정의 반드시 해줘야 한다.
 * private 불가능
 */
public class Example {
    public static void main(String[] args) {

        //Phone phone = new Phone(); 블 가 능

        Smartphone smartphone = new Smartphone("채림쓰");

        smartphone.turnOn();
        smartphone.internetSearch();
    }
}
