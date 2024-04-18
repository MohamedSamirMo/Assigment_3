import java.util.Scanner;

public class ArrayCopyWithMultiplication {
    public static void main(String[] args) {
        // Scanner --> input
        Scanner scanner =new Scanner(System.in);
        // message input size by using scanner
        System.out.println("Enter array Size");
        int size = scanner.nextInt();
        // Enter Array with size
        int[] originalArray = new int[size];
        int[] copiedArray = new int[size];
        // Adding Array element
        System.out.println("Enter the elements of the array:");
        for (int i=0 ; i<size ;i++){
            originalArray[i]=scanner.nextInt();
            copiedArray[i]=originalArray[i]*2;

        }
        // display result
        System.out.println("\nCopied Array:");
        for (int num : copiedArray)
            System.out.print(num + " ");
    }
}