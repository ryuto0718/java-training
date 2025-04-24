public class Main{
    public static void main(String[] args){
        System.out.print("数値を入力 > ");
        int num = new java.util.Scanner(System.in).nextInt();
        int count = 0;
        for(int i = 0;i < num;i++){
            count++;
            System.out.println(count + ": Hello,World");
        }
    }
}