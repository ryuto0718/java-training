import java.io.*;

public class Main{
    public static void main(String[] args){
        try{
            FileWriter fw = new FileWriter("date.txt");
            fw.write("hello!");
        }catch(Exception e){            
            System.out.println("何らかの例外が発生しました");
        }finally{
        fw.close();         //この行でエラーが出る
        }
    }
}