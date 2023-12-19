import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число A:");
        int A = scanner.nextInt();
        System.out.println("Введите число B:");
        int B = scanner.nextInt();

        if (A < B) {
            printIncreasing(A, B);
        } else {
            printDecreasing(A, B);
        }
    }

    // Рекурсивная функция для вывода чисел в порядке возрастания
    public static void printIncreasing(int current, int end) {
        if (current > end) {
            return;
        }

        System.out.print(current + " ");
        printIncreasing(current + 1, end);
    }

    // Рекурсивная функция для вывода чисел в порядке убывания
    public static void printDecreasing(int current, int end) {
        if (current < end) {
            return;
        }

        System.out.print(current + " ");
        printDecreasing(current - 1, end);
    }
}