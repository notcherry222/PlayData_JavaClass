package july10.interfaceExample3;

public class Bus implements Vehicle{
    @Override
    public void run() {
        System.out.println("버스간당");
    }
    public void checkFare(){
        System.out.println("승차요금 체크체크~");
    }
}
