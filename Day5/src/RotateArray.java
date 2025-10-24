import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {
    public static void rotateArray(int arr[],int k){
    int n = arr.length;
    k = k%n;
    int result[]= new int [n];

    for(int i=0;i<n;i++){
        result[(i+k)%n]=arr[i];
    }
    for(int i=0;i<n;i++){
        arr[i]=result[i];
    }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]= {1,2,3,4,5,6,7,8};
        int k = sc .nextInt();
        rotateArray(arr,k);
        System.out.print(Arrays.toString(arr));
    }

}
