import java.util.Scanner;

public class AddElementToArray {
    public static void main(String[] args) {
        int[] arr = new int[10];
        arr[0] = 10;
        arr[1] = 4;
        arr[2] = 6;
        arr[3] = 7;
        arr[4] = 8;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number:");
        int x = scanner.nextInt();
        System.out.println("Enter index add");
        int index = scanner.nextInt();
        if (index <= 1 || index > arr.length) {
            System.out.println("Can't enter element to array");
        } else {
            for (int i = arr.length - 1; i > index; i--) {
                arr[i] = arr[i - 1];
            }
            arr[index] = x;
        }
        for (int output : arr) {
            System.out.println(output);
        }
    }
}
