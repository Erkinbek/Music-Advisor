import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int n = scanner.nextInt();
        if (str.length() < n) {
            System.out.println(str);
        } else {
            String str1 = str.substring(0, n);
            String str2 = str.substring(n, str.length());
            System.out.println(str2 + str1);
        }
    }
}