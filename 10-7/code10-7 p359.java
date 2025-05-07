public class Hero{
    String name = "ミナト";  
    int hp = 100;   
    public void slip(){
        this.hp -= 5;
        System.out.println(this.name + "は転んだ転んだ！");
        System.out.println("５ダメージ");
    }
    public void run(){
        System.out.println(this.name + "は逃げ出した！");
    }
}