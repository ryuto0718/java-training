public class Main{
    public static void main(String[] args){
		FileWriter fw = new FileWriter("date.txt");		
//FileWriterのコンストラクタは
//IOExceptionを発生させる可能性がある	
//が、try-catch文を記述していない
//（失敗時にどうするか考えていない）
    }
}