package july7.daHyeongSeong1;

public class Tire {
    //필드
    public int maxRotate; //최대 회전
    public int accum; // 누적회전수
    public String location; // 타이어 위치

    //생성자
    public Tire(String location, int maxRotate){
        this.location = location;
        this.maxRotate = maxRotate;
    }

    //메소드
    public boolean roll(){
        ++accum;
        if (accum < maxRotate){
            System.out.println("타이어 수명 : " + (maxRotate-accum));
            return true;
        }else {
            System.out.println(location);
            return false;
        }
    }
}
