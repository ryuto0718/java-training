public class Hero extends Character{
    String name = "ミナト";
    public void atack(Matango m){
        System.out.println(this.name + "の攻撃！");
        System.out.println("敵に10ポイントのダメージをあたえた!");
        m.hp -= 10;
    }
}