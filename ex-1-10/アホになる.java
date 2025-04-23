public class Main{
    public static void main(String[] args){
        System.out.print("数字を入力 > ");
        String input = new java.util.Scanner(System.in).nextLine();
        boolean isAho = false;
        for(int i = 0;i < input.length();i++){
            if(input.charAt(i) == '3'){
                isAho = true;
            }
        }
        int inputInt = Integer.parseInt(input);
        if(inputInt % 3 == 0){
            isAho = true;
        }
        if(isAho){
            System.out.println("アホ");
        }else{
            System.out.println("...");
        }
    }
}