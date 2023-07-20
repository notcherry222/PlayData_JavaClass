package july20.que;

import java.util.LinkedList;
import java.util.Queue;
//선입선출
public class QueEx {
    public static void main(String[] args) {
        Queue<Message> mq = new LinkedList<Message>();

        mq.offer(new Message("send mail" , "cherry"));
        mq.offer(new Message("send kakao" , "gun"));

        while(!mq.isEmpty()){
            Message m = mq.poll();
            switch(m.command){
                case "send mail" :
                    System.out.println("send mail to "+m.to);
                    break;
                default :
                    System.out.println("send kakao to "+m.to);
                    break;
            }
        }
    }
}
