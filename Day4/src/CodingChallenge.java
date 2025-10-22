import java.util.Scanner;

public class CodingChallenge {
    public static int findMissing(int arr[]){
        int n = arr.length+1;
        int totalsum = n*(n+1)/2;
        int arraysum =0;
        for(int num : arr){
            arraysum +=num;
        }
        int miss = totalsum-arraysum;
        return miss;
    }
    public static void main(String[] args) {
    int[]arr = {1,2,3,5,6,7,8,9,10};
    int res = findMissing(arr);
        System.out.println("misssing element : "+res);
    }
}
