① Y[]
② public class Main{
    public static void main(String[] args){
        Y[] y = new Y[2];
        y[0] = new A();
        y[1] = new B();
        for(Y y1 : y){
            y1.b();
        }
    }
}