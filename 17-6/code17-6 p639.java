import java.io.*;

public class Main{
    public static void main(String[] args){
        FileWriter fw = new FileWriter("date.txt");         //mainメソッドブロック（５～１２行目）をfwのスコープにする
        try{
            fw.write("hello!");         //スコープ内だからfwを利用可能！
        }catch(Exception e){            
            System.out.println("何らかの例外が発生しました");
        }finally{
        fw.close();         //スコープ内だからfwを利用可能！
        }
    }
}