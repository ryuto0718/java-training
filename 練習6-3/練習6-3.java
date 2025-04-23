
import comment.Zen.Zenhan;
import comment.Kou.Kouhan;
public class Main{
    public static void main(String[] args){
        Zenhan.doWarusa();
        Zenhan.doTogame();
        Kouhan.callDeae();
        try{
            Kouhan.showMondokoro();
        }catch(Exception e){
            e.printStackTrace();
        }
        try{
            Thread.sleep(3000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        Zenhan.doTogame();
    }
}