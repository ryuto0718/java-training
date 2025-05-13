import java.io.*;

public class Main{
    public static void main(String[] args){
	try(FileWriter fw = new FileWriter("data.txt")){
	
	//try-catch文を抜ける際に、自動的にclose()が呼び出されるので、
	//finallyブロックの記述は不要

            fw.write("hello!");         
        }catch(Exception e){            
            System.out.println("何らかの例外が発生しました");   
        }
    }
}