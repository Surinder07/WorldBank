import java.util.Scanner;

public class ArrayPractice {
    public static void main(String[] args) {

        int input = 0;
        int sum = 0;
        int[] arr = new int[10];

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the elements of the array : ");


        for(int i = 0;i< arr.length;i++){

            input = scanner.nextInt();

        }

        System.out.println("Display the elements of the array : ");

        for(int i = 0;i<arr.length;i++){


            System.out.println(arr[i]);
        }


        System.out.println("sum of elements ");


        for(int i = 0;i<arr.length;i++){


            sum = sum+arr[i];

        }
        System.out.println(sum);
    }
}
