public interface Human extends Creature{
    void talk();        //これらの抽象メソッドを追加した
    void watch();
    void hear();
    //さらに、親インタフェースからrun()を継承する
}
