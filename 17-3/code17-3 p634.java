import java.io.*;

public class Main{
    public static void main(String[] args){
        try{
            FileWriter fw = new FileWriter("date.txt");
            fw.write("hello!");
            fw.close();
        }catch(Exception e){            //Exceptionの子孫をどれでもキャッチ
            System.out.println("何らかの例外が発生しました");
        }
    }
}