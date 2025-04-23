public class Main{
    public static void main(String[] args){
       System.out.println("曜日を入力してください");
       System.out.print("0=日曜、1=月曜、2=火曜、3=水曜、4=木曜、5=金曜、6=土曜 >");
       int day = new java.util.Scanner(System.in).nextInt();
       System.out.println("時間を入力してください");
       System.out.print("0=午前、1=午後2、2=夜間 >");
       int time = new java.util.Scanner(System.in).nextInt();
       int c = new java.util.Random().nextInt(4);

       String[] A ={"インフルエンザ","新型コロナウィルス","風邪","仮病"};

        
        switch(day){
            case 0:
                switch(time){
                    case 0,1,2:
                    System.out.println("病院は休診です");
                }
                break;
            case 1:
                switch(time){
                    case 0,1:
                    System.out.println("病院は開いています");
                    System.out.println("診療結果は" + A[c] + "でした");
                    break;
                    case 2:
                    System.out.println("病院は休診です");
                }
                break;
            case 2:
            switch(time){
                case 0,1:
                System.out.println("病院は開いています");
                System.out.println("診療結果は" + A[c] + "でした");
                break;
                case 2:
                System.out.println("病院は休診です");
            }
            break;
            case 3:
            switch(time){
                case 0:
                System.out.println("病院は開いています");
                System.out.println("診療結果は" + A[c] + "でした");
                break;
                case 1,2:
                System.out.println("病院は休診です");
            }
            break;
            case 4:
            switch(time){
                case 0:
                System.out.println("病院は開いています");
                System.out.println("診療結果は" + A[c] + "でした");
                break;
                case 1,2:
                System.out.println("病院は休診です");
            }
            break;
            case 5:
            switch(time){
                case 0,1:
                System.out.println("病院は開いています");
                System.out.println("診療結果は" + A[c] + "でした");
                break;
                case 2:
                System.out.println("病院は休診です");
            }
            break;
            case 6:
            switch(time){
                case 2:
                System.out.println("病院は開いています");
                System.out.println("診療結果は" + A[c] + "でした");
                break;
                case 0,1:
                System.out.println("病院は休診です");
            }
            break;
        }
    }
}