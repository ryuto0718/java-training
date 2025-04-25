public class Main{
    public static void main(String[] args){
        int yusha_hp = 100;
        int matango1_hp = 50;
        int matango_hp = 48;
        String yusha_name = "ミナト";
        int matango1_level = 10;
        int matango2_level = 10;
        System.out.println(yusha_name + "は５秒座った！");
        yusha_hp += 5;
        System.out.println("HPが5ポイント回復した");
        System.out.println(yusha_name + "は、転んだ！");
        yusha_hp -= 5;
        System.out.println("５のダメージ！");
        System.out.println(yusha_name + "は、２５秒座った！");
        yusha_hp += 25;
        System.out.println("HPが25ポイント回復した");
        System.out.println(yusha_name +"は、逃げ出した！");
        System.out.println("GAMEOVER");
        System.out.println("最終HPは、" + yusha_hp + "でした");
    }
}