public class Main{
    public static boolean loginCheck(String inputname,String inputpassword,String name,String password){

        if(inputname.equals(name) && inputpassword.equals(password)){
            System.out.println("ログイン成功");
            return false;
        }else{
            System.out.println("ログイン失敗");
            return true;
        }
    }
    public static void main(String[] args){
        System.out.println("ログインします");
        boolean isLogin = true;
        while(isLogin){
            System.out.print("ユーザ名 > ");
            String name = new java.util.Scanner(System.in).nextLine();
            System.out.print("パスワード > ");
            String password = new java.util.Scanner(System.in).nextLine();
            isLogin = loginCheck(name,password,"String","String");
        }
    }
}