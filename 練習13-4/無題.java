public class Wizard{
    private int hp;
    private int mp;
    private String name;
    private Wand wand;
    
    public void heal(Hero h){
        int basePoint = 10;                                              //基本回復ポイント
        int recovPoint = (int)(basePoint * this.wand.getPower());        //杖による増幅
        h.setHp(h.getHp() + recovPoint);                                 //勇者のHPを回復する
        System.out.println(h.getName() + "のHPを" + recovPoint + "回復した！");
    }
    public int getHp(){
        return this.hp;
    }
    public void setHp(int hp){
        if(hp < 0){
            this.hp = 0;
        }else{
            this.hp = hp;
        }
    }
    public int getMp(){
        return this.mp;
    }
    public void setMp(int mp){
        if(mp < 0){
            throw new IllegalArgumentException("処理を中断。");
        }
        this.mp = mp;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        if(name == null){
            throw new IllegalArgumentException("名前がnullである。処理を中断。");
        }
        if(name.length() < 3){
            throw new IllegalArgumentException("短すぎる名前。処理を中断。");
        }
        this.name = name;
    }
    public Wand getWand(){
        return this.wand;
    }
    public void setWand(Wand wand){
        if(wand == null){
            throw new IllegalArgumentException("杖を装備していない。処理を中断");
        }
        this.wand = wand;
    }
}
