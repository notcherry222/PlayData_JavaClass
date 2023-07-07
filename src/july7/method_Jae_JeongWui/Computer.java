package july7.method_Jae_JeongWui;

/**
 * 자식 클래스
 */
public class Computer extends Calculator{
    @Override
    double areaCircle(double r){

        if(r > 10){
            System.out.println("computer 객체의 areaCircle() 실행.");
        }else {
            super.areaCircle(r);
        } return  Math.PI*r*r;
    }
}
