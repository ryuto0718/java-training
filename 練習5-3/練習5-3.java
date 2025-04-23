public class Main{
    public static void main(String[] args){
        email("メールの宛先アドレス","メールの本文");
    }
    public static String email(String title,String address,String text){
        System.out.println(title + "に、以下のメールを送信しました");
        System.out.println( "件名：" + address);
        System.out.println("本文：" + text);
        return title + address + text;
    }
    public static String email(String address,String text){
        System.out.println(address + "に、以下のメールを送信しました");
        System.out.println( "件名：無題");
        System.out.println("本文：" + text);
        return address + text;
    }
}