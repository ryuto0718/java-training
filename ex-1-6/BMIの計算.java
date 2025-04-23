public class Main{
    public static void main(String[] args){
        System.out.println("BMIを計算します");
        System.out.println("身長と体重を入力してください");
        System.out.print("身長(cm)>");
        int cm = new java.util.Scanner(System.in).nextInt();
        System.out.print("体重(kg)>");
        int kg = new java.util.Scanner(System.in).nextInt();
        double m = cm / 100.0;
        double BMI = (kg / (m * m));
        System.out.println("あなたのBMIは" + BMI + "でした。");
    }
}