public class Main{
    public static void main(String[] args){
        Wizard w = new Wizard();
        Character c = w;        //Character型の箱に代入
        Matango m = new Matango('A');
        c.name = "アサカ";
        c.attack(m);
        c.fireball(m);          //この行でエラーが発生する
    }
}