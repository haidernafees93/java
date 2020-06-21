import java.util.Arrays;

public class binarysearch {
    public static int iterativeSearch(int[] arr, int value){
        Arrays.sort(arr);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int start = 0;
        int end = arr.length;

        while(start != end){
           int midpoint = (start + end)/2;
           if(value == arr[midpoint]){
               return midpoint;
           }
           else if(value < arr[midpoint]){
               end = midpoint;
           }
           else{
               start = midpoint + 1;
           }
        }
        return -1;
    }

    public static int recursiveSearch(int[] arr, int value){
        int start = 0;
        int end = arr.length;
        int midpoint = (start+end)/2;
        Arrays.sort(arr);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        return search(arr, value, start, midpoint, end);
    }

    public static int search(int[] arr, int value, int start, int midpoint, int end){
        midpoint = (start+end)/2;
        if(start >= end){
            return -1;
        }
        else if(value == arr[midpoint]){
            return midpoint;
        }
        else if(value < arr[midpoint]){
            end = midpoint;
            return search(arr, value, start, midpoint, end);
        }
        else{
            start = midpoint+1;
            return search(arr, value, start, midpoint, end);
        }
    }

    public static void main(String[] args){
        int[] array = {4,1,5,3,7};
        System.out.println("Index of 7 = "+ recursiveSearch(array, 7));
    }
}