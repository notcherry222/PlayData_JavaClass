package july10.interfaceExample;

public class Television implements RemoteControl, Searchable{

    //필드
    private int volume;

    //추상 메소드의 실제 메소드
    public void turnOn(){
        System.out.println("Turn on the TV.");
    }

    public void turnOff() {
        System.out.println("Turn off the TV.");
    }

    public void setVolume(int volume) {
        if(volume > RemoteControl.max_volume){
            this.volume =RemoteControl.max_volume;}
        else if (volume<RemoteControl.min_volume){
            this.volume = RemoteControl.min_volume;
        } else {this.volume= volume;}
        System.out.println(this.volume);
    }

    @Override
    public void search(String url) {
        System.out.println(url + "을 검색합니다.");
    }
}
