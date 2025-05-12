public class Hero{
    private String name;
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        if(name == null){			//名前にnullが代入されそうになった！
            throw new IllegalArgumentException("名前がnullである。処理を中断。");
        }
        if(name.length() <= 1){		//短すぎる名前が設定されそうになった！
            throw new IllegalArgumentException("名前が短すぎる。処理を中断。");
        }
        if(name.length() >= 8){		//長すぎる名前が設定されそうになった！
            throw new IllegalArgumentException("名前が長すぎる。処理を中断。");
        }
        this.name = name;			//検査完了。代入しても大丈夫
    }
}