public class Main{
    public static void main(String[] args) {
        for (int i = 3; i <= 100; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    System.out.println(i + ":");
                    break;
                }
            }
            if (isPrime) {
                System.out.println(i +":は素数である");
            }
        }
    }
}