import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine();
        if (comparer(num)) {
            System.out.println("Lucky");
        } else {
            System.out.println("Regular");
        }
    }

    public static boolean comparer(String str)
    {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < 6; i++) {
            char a = str.charAt(i);
            if (i < 3) {
                sum1 = sum1 + Character.getNumericValue(a);
            } else {
                sum2 = sum2 + Character.getNumericValue(a);
            }
        }
        return (sum1 == sum2);
    }
}