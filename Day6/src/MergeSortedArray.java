import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int arr1[]={2,4,6,8};
        int arr2[]={1,3,5,7,9};
       int temp[]= mergeArray(arr1,arr2);
        System.out.println(Arrays.toString(temp));
    }

    private static int[] mergeArray(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int merge[]= new int [n1+n2];
        int i=0,j=0,k=0;
        while(i<n1 && j<n2){
            if(arr1[i]<=arr2[j]){
                merge[k++]=arr1[i++];
            }else{
                merge[k++]=arr2[j++];
            }
        }
        while(i<n1){
            merge[k++]=arr1[i++];
        }
        while(j<n2){
            merge[k++]=arr2[j++];
        }
        return merge;
        }
    }

