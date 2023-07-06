package july6_static_singleton.singleton;

public class SingleTonExample {
    public static void main(String[] args) {
        SingleTon obj1 = SingleTon.getInstance();
        SingleTon obj2 = SingleTon.getInstance();
        if(obj1 ==obj2){
            System.out.println("same singleton.");
        }else{
            System.out.println("different singleton.");
        }
    }
}
