import java.io.*;

public class Main{
    public static void main(String[] args){
        String s = null;
        try{
            s.length();
        }catch(NullPointerException e){
            System.out.println("NullPointerException例外をcatchしました");
            System.out.println("－－スタックトレース（ここから）－－");
            e.printStackTrace();
            System.out.println("－－スタックトレース（ここまで）－－");
        }
    }
}