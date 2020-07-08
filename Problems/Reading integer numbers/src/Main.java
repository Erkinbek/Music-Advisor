import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] numbers = str.split(" ");
        for (int i = 0; i < numbers.length; i++) {
            if (!numbers[i].equals("")) System.out.println(numbers[i]);
        }
    }
}