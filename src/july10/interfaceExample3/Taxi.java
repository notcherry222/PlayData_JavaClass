package july10.interfaceExample3;

public class Taxi implements Vehicle{
    @Override
    public void run() {
        System.out.println("택시 간다");
    }
}
