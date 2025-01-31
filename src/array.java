import java.lang.reflect.Array;
import java.util.Arrays;

public class array {
    public static void main(String[] args) {
        String []name={"bini","jjejj","uu"};
        for(String i: name){
            System.out.println(i);
        }
        int a[][]={{1,2,3},
                {4,5,6},
                {7,8,9,10}
        };
//        for(int i=0;i<a.length;i++){
//            for(int j=0;j<a[0].length;j++){
//                System.out.print(a[i][j] + " ");
//            }
//            System.out.println();
//        }
//        for(int i=0;i<a.length;i++){
//            System.out.println(Arrays.toString(a[i]));
//        }

        //-----swapping

        int []b={1,2,3,4,5,6};
        swap(b,0,4);
        reverse(b);
        System.out.println(Arrays.toString(b));
    }
    static void swap(int arr[],int a,int b)
    {
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=arr[a];
    }
 static void reverse(int arr[]){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
 }
}
