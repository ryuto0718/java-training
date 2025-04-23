public class Main{
    public static double calcTriangleArea(double bottom,double height){
        double ans = bottom * height / 2;
        System.out.println("三角形の底辺の長さが" + bottom + "cm、高さが" + height + "cmの場合、面積は" + ans + "平方cm");
        return ans;
    }
    public static double calcCircleArea(double radius){
        double goukei = radius * radius * 3.14;
        System.out.println("円の面積が" + radius + "の場合、面積は" + goukei + "平方cm");
        return goukei;
    }
    public static void main(String[] args){
        double ans = calcTriangleArea(10.0,5.0);
        double goukei = calcCircleArea(5.0);
    }
}