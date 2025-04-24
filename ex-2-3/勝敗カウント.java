public class Main{
    public static void main(String[] args){
        int count = 0;
        int counts = 0;
        for(int i = 0;i < 10;i++){
            System.out.print("勝敗を入力してください(0:負け、1:勝ち) > ");
            int number = new java.util.Scanner(System.in).nextInt();
            if(number == 1){
                count += 1;
            }
            else if(number == 0){
                counts += 1;
            }
        }
        System.out.println("勝ち: " + count + "回、負け: " + counts + "回");
    }
}