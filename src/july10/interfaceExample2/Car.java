package july10.interfaceExample2;

public class Car {
    Tire frontLeftTire = new HankookTire();
    Tire frontRightTire = new KumhoTire();
    void run(){
        frontLeftTire.roll();
        frontRightTire.roll();
    }
}
