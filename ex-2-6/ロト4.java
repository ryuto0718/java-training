public class Main{
    public static void main(String[] args){
        System.out.println("ロト4を始めます");
        int[] winningNumber = {4,4,1,2};
        boolean isWinningNumber = true; 
        for(int i = 0;i < winningNumber.length;i++){
            System.out.print((i + 1) + "個目の数字を入力してください > ");
            int input = new java.util.Scanner(System.in).nextInt(); 
            if(winningNumber[i] != input){
                isWinningNumber = false;
            }
        }
        if(isWinningNumber){
            System.out.println("大当たり");
        }else{
            System.out.println("はずれ");
        }
    }
}