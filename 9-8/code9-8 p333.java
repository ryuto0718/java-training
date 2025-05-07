//次にHeroクラスを定義する
public class Hero{
    String name;  
    int hp;      
    Sword sword;        //勇者が装備している剣の情報
    public void attack(){
        System.out.println(this.name + "は攻撃した！");
        System.out.println("敵に５ポイントのダメージをあたえた！");
    }
    public Hero(){
        this.hp = 100;      //hpフィールドを100で初期化
    }
}