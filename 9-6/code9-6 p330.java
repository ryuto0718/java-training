public class Main{
    public static void main(String[] args){
        Hero h1  = new Hero();          //インスタンスを生成
        h1.name = "ミナト";             //初期値をセット
        h1.hp = 100;
        Hero h2  = new Hero();
        h2.name = "アサカ";
        h2.hp = 100;
        Wizard w = new Wizard();
        w.name = "スガワラ";
        w.hp = 50;
        w.heal(h1);                     //やっと、ここからメインプログラム   
        w.heal(h2);     
        w.heal(h2);   
    }
}