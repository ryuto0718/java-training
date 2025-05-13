import java.io.*;

public class Main{
    public static void main(String[] args){
        FileWriter fw = null;      //mainメソッドブロック（5~13行目）はfwのスコープのまま
        try{
            fw = new FileWriter("data.txt");            //tryブロック内でコンストラクタが動作する
            fw.write("hello!");         
        }catch(Exception e){            
            System.out.println("何らかの例外が発生しました");
        }finally{
            try{
                fw.close();  
            }catch(IOException e){
                ;
            }       
        }
    }
}