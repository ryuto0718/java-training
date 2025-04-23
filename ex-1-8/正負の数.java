public class Main{
    public static void main(String[] args){
        System.out.print("-100 ~ 100 を入力>");
        int num = new java.util.Scanner(System.in).nextInt();
        System.out.print("入力された数値は");
            if(num > 0){
                if(num % 2 == 0){
                    System.out.print("正の偶数");
                }else{
                    System.out.print("正の奇数");
                }
            }
            if(num < 0){
                if(num % 2 == 0){
                    System.out.print("負の偶数");
                }else{
                    System.out.println("負の奇数");
                }
            }
    }
}