public class Cleric {
    public static void main(String[] args){
        Cleric a = new Cleric();
        a.name = "クレリック";
        a.hp = 50;
        a.mp = 10;

        a.selfAid();
        a.pray(3);
    }
    String name;
    int hp;
    final int MAXHP =50;
    int mp;
    final int MAXMP = 10;

    public void selfAid(){
        this.mp -= 5;
        this.hp = MAXHP;
        System.out.println("魔法:セルフエイド");
        System.out.println("MPを5消費してHPを最大まで回復");
    }

    public int pray(int b){
        System.out.println("行動:" + b + "秒祈る");
        int x = new java.util.Random().nextInt(3);
        int num = x + b;
        if(b == 0){
            System.out.println("MPを0回復");
            System.out.println("現在のMP:" + this.mp);
        }else if(this.mp + num <= MAXMP){
            this.mp += num;
            System.out.println("MPを" + num + "回復");
            System.out.println("現在のMP:" + this.mp);
        }else{
            num = MAXMP - this.mp;
            System.out.println("MPを" + num + "回復");
            System.out.println("現在のMP:" + MAXMP);
        }
        return this.mp;
    }
}
