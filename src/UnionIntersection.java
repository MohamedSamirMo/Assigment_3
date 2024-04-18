import java.util.Scanner;

public class UnionIntersection {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        // input array 1
        System.out.print("Enter first array size: ");
        int size=scanner.nextInt();
        int []array1= new int[size];
        System.out.println("Enter first array elements:");
        for (int i=0;i<size;i++){
            array1[i]=scanner.nextInt();
        }
        System.out.print("Enter second array size: ");
        int size2=scanner.nextInt();
        int []array2= new int[size2];
        System.out.println("Enter second array elements:");
        for (int i=0;i<size2;i++){
            array2[i]=scanner.nextInt();
        }
        // Calculate and print union
        System.out.println("Union:");
        //for content arr1
        for (int i = 0; i < size; i++) {
            System.out.println(array1[i]);
        }
        // for content arr2
        for (int i = 0; i < size2; i++) {
            // check arr1 u arr2  بدون تكرار
            boolean found = false;
            for (int j = 0; j < size; j++) {
                if (array2[i] == array1[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println(array2[i]);
            }
        }
        // Calculate and print intersection
        System.out.println("Intersection:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size2; j++) {
                if (array1[i] == array2[j]) {
                    System.out.println(array1[i]);
                    break;
                }
            }
        }

    }
}
