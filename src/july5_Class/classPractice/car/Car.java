package july5_Class.classPractice.car;

public class Car {
    /**
     * 필드
     */
    String company = "현대";
    String model = "그랜저";
    String color = "red";
    int speed;

    /**
     * 생성자
     */
    Car(){
    }
    Car(String model){
        this.model=model;
    }
    Car(String model, String color){
        this.model = model;
        this.color = color;
    }
}
