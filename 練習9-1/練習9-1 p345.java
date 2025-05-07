public class Thief {
    public static void main(String[] args){
        Thief h = new Thief("アサカ",40,5);                         //インスタンス
        System.out.println("名前:" + h.name + "HP:" + h.hp + "MP:" + h.mp);
        Thief h1 = new Thief("アサカ",35);
        System.out.println("名前:" + h1.name + "HP:" + h1.hp + "MP:" + h1.mp);
        Thief h2 = new Thief("アサカ");
        System.out.println("名前:" + h2.name + "HP:" + h2.hp + "MP:" + h2.mp);
        Thief h3 = new Thief();
        System.out.println("名前:" + h3.name + "HP:" + h3.hp + "MP:" + h3.mp);
    }


    String name;            //フィールド
    int hp;
    int mp;


    public Thief(String name,int hp,int mp){            
        this.name = name;					//コンストラクタ
        this.hp = hp;
        this.mp = mp;
    }
    public Thief(String name,int hp){
        this(name,hp,5);
    }
    public Thief(String name){
        this(name,40,5);
    }
    public Thief(){
    }
}
