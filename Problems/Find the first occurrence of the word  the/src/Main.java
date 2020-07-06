import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine().toUpperCase();
        int index = str.indexOf("THE");
        System.out.println(index);
    }
}