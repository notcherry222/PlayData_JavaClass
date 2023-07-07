package july7.sangsoc;

public class PhoneExample {

    public static void main(String[] args) {
        DmbPhone myPhone = new DmbPhone("i-phone", "white", 123);

        System.out.println("my phone is "+ myPhone.model + " and my number is " + myPhone.number);

        //상속 받은 메소드 사용
        myPhone.power();
        myPhone.sendVoice("HI");

        //Dmbphone 메소드
        myPhone.numberSend(12345);
    }

}
