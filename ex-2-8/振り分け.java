public class Test{
    public static void main(String[] args){
        int[] input = { new java.util.Random().nextInt(100),
                        new java.util.Random().nextInt(100),
                        new java.util.Random().nextInt(100),
                        new java.util.Random().nextInt(100),
                        new java.util.Random().nextInt(100),
                        new java.util.Random().nextInt(100),
                        new java.util.Random().nextInt(100),
                        new java.util.Random().nextInt(100),
                        new java.util.Random().nextInt(100),
                        new java.util.Random().nextInt(100)};
        System.out.print("偶数[");
        for(int i = 0;i < input.length;i++){
            if(input[i] % 2 == 0){
                System.out.print(input[i] + " ");
            }
        }
        System.out.println("]");
        System.out.print("奇数[");
        for(int i = 0;i < input.length;i++){
            if(input[i] % 2 != 0){
                System.out.print(input[i] + " ");
            }
        }
        System.out.print("]");
    }
}