package july20.stack;

import java.util.*;

public class StackEx {
    public static void main(String[] args) {
        Stack<Coin> coinBox = new Stack<Coin>() ;

        coinBox.push(new Coin(100));
        coinBox.push(new Coin(500));
        coinBox.push(new Coin(10));
        coinBox.push(new Coin(50));

        while(!coinBox.isEmpty()){
            Coin coin = coinBox.pop(); //후입선출
            System.out.println(coin.getVal());
        }
    }
}
