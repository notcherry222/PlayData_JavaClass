package july7.choosangClass;

public class Smartphone extends Phone{
    //생성자
    public Smartphone(String owner){
        super(owner);
    }

    //메소드
    public void internetSearch(){
        System.out.println("Searching!");
    }
}
