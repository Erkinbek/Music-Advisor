import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int t1,t2;
        t1 = (h-b) / (a-b);
        t2 = ((h-b) % (a-b)) > 0 ? 1 : 0;
        System.out.println(t1+t2);
    }
}