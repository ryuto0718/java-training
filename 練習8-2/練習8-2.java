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