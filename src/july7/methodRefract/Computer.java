package july7.methodRefract;

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
