//次にHeroクラスを定義する
public class Hero{
    String name;  
    int hp;      
    Sword sword;        //勇者が装備している剣の情報
    public void attack(){
        System.out.println(this.name + "は攻撃した！");
        System.out.println("敵に５ポイントのダメージをあたえた！");
    }
    public Hero(String name){
        this.hp = 100;      //hpフィールドを100で初期化
        this.name = name;       //引数の値でnameフィールドを初期化
    }
    public Hero(){
        this.Hero = "ダミー";
    }
}