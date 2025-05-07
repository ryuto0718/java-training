public class PoisonMatango extends Matango{
    int p = 5;
    public PoisonMatango(char suffix){
        super(suffix);
    }
    public void attack(Hero h){
        super.attack(h);
        if(this.p > 0){
            System.out.println("さらに毒の胞子をばらまいた！");
            h.hp /=5;
            System.out.println(h.hp + "ポイントのダメージ！");
            this.p--;
        }
    }
}
