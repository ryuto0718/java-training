public class Hero{
    String name = "ミナト";  
    int hp = 100;
    public Hero(){
        System.out.println("Heroのコンストラクタが動作");
    }
    public void slip(){
        this.hp -= 5;
        System.out.println(this.name + "は転んだ転んだ！");
        System.out.println("５ダメージ");
    }   
    public void attack(Matango m){
        System.out.println(this.name + "の攻撃！");
        m.hp -= 10;
        System.out.println("敵に10ポイントのダメージをあたえた!");
    }
    public void run(){
        System.out.println(this.name + "は逃げ出した！");
    }
}