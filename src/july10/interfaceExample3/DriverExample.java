package july10.interfaceExample3;

public class DriverExample {
    public static void main(String[] args) {
        Driver driver = new Driver();

        Bus bus = new Bus();
        Taxi taxi = new Taxi();

        //다형성 특징 덕분에 실행되는
        driver.drive(bus);
        driver.drive(taxi);
    }
}
