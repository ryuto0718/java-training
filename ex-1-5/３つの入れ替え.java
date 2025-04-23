public class Main{
    public static void main(String[] args){
        int x = 10;
        int y = 5;
        int z = 3;
        int temp = x;
        int a = y;
        x = z;
        y = temp;
        z = a;
        System.out.println("x=" + x + ",y=" + y + ",z=" + z);
    }
}