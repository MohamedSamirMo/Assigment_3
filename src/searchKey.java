import java.util.Scanner;
public class searchKey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array Size");
        int size = scanner.nextInt();
        // Create an array to store integers
        int[] array = new int[size];
        // Enter elements into the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        // Ask user for the value to search
        System.out.println("Enter the value to search:");
        int searchValue = scanner.nextInt();
        // Search for the value in the array
        boolean found =false;
        for (int i = 0; i < size; i++) {
            if (array[i] == searchValue) {
                found=true;
                break;

            }

        }

        if (found){ System.out.println("Found");}else { System.out.println("Not Found");}









        // code test
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter array Size");
//        int size = scanner.nextInt();
//        // Enter Array with size
//        int[] array = new int[size];
//        System.out.println("Enter the elements of the array:");
//        for (int i = 0; i < size; i++) {
//            array[i] = scanner.nextInt();
//        }
////         Ask user for the value to search
//        System.out.println("Enter the value to search:");
//        int searchValue = scanner.nextInt();
//        for (int i = 0; i < size; i++) {
//            if (array[i] == searchValue) {
//                System.out.println("Found");
//            } else {
//                System.out.println("No Found");
//            }
//        }


    }
}
