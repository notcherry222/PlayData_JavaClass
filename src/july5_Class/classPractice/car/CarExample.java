package july5_Class.classPractice.car;

public class CarExample {
    public static void main(String[] args) {
        /**
         * 객체 생성
         * Car는 기본 생성자
         */
        Car myCar = new Car();

        /**
         * 필드값 읽기
         */
        System.out.println("제작회사 : "+myCar.company);
        /**
         * 필드값 변경
         */
        myCar.speed = 60;
        System.out.println("수정된 속도 : "+myCar.speed);

        Car car1 = new Car();
        System.out.println(car1.company);

        Car car2 = new Car("자가용");
        System.out.println(car2.company + " " + car2.model);
        System.out.println(car1);
        System.out.println(car1.toString()); // toString() 메소드 : 객체가 갖고 잇는 정보나 값들을 문자열로 만들어 리턴
    }
}
