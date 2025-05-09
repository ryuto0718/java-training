public class Hero extends Character{
    String name = "ミナト";
    public void attack(Matango m){      //お化けキノコ攻撃用
        System.out.println(this.name + "の攻撃！");
        System.out.println("敵に10ポイントのダメージをあたえた!");
        m.hp -= 10;
    }
    public void attack(Slime s){        //ゴブリン攻撃用
        System.out.println(this.name + "の攻撃！");
        System.out.println("敵に10ポイントのダメージをあたえた!");
        s.hp -= 10;
    }
}