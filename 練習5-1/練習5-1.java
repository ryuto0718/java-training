public class Main{
    public static String introduceOneself(String name){
        System.out.print("私の名前は" + name + "です。");
        return name;
    }
    public static int introduceOneself(int age){
        System.out.print("年齢は" + age + "歳です。");
        return age;
    }
    public static double introduceOneself(double cm){
        System.out.println("身長は" + cm + "cmです。");
        return cm;
    }
    public static char introduceOneself(char a){
        System.out.println("十二支は" + a + "です。");
        return a;
    }
    public static void main(String[] args){
        introduceOneself("湊雄輔");
        introduceOneself(22);
        introduceOneself(169.9);
        introduceOneself('辰');
    }
}