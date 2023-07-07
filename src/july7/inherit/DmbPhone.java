package july7.inherit;

public class DmbPhone extends CellPhone{
    //필드
    int number;

    //생성자
    DmbPhone(String model, String color, int number){
        this.model = model;
        this.color = color;
        this.number = number;
    }

    //메소드
    void numberSend(int number){
        System.out.println("This is my number. " +number);
    }
}
