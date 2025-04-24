public class Main{
    public static void main(String[] args){
        String[] a = new String[5]; 
        for(int i = 0;i < a.length;i++){
            System.out.print((i + 1) + "文字目を入力してください > ");
            String imput = new java.util.Scanner(System.in).nextLine();
            a[i] = imput;
        }
        for(int i = a.length - 1;i >= 0;i--){
            System.out.println((i + 1) + "文字目:" + a[i]);
        }
    }
}